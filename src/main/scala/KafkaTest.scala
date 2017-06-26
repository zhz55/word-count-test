/**
  * Created by kasim on 2017/6/22.
  */

import java.io.ByteArrayInputStream

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Body1_1Impl
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.storage.StorageLevel
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.kafka010._
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe

import ctitc.seagoing.SEAGOING._
import rules.PositionRules

object KafkaTest {

  def main(args: Array[String]): Unit = {
    val ssc = new StreamingContext("local[2]", "KafkaSpark", Seconds(5))

    val kafkaParams = Map[String, Object](
      "bootstrap.servers" -> "kf01:9092,kf02:9092",
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[org.apache.kafka.common.serialization.ByteArrayDeserializer],
      "group.id" -> "scala_kafka_test",
      "auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)
    )

    val topics = Array("LWLK_POSITION")
    val stream = KafkaUtils.createDirectStream[String, Array[Byte]](
      ssc,
      PreferConsistent,
      Subscribe[String, Array[Byte]](topics, kafkaParams)
    )
    val positionRules = new PositionRules
    stream.foreachRDD(rdd => {
      if(!rdd.isEmpty()) {
        rdd.foreachPartition(partitionRecords => {
          partitionRecords.map(record => (VehiclePosition.parseFrom(record.value()),
              {if(VehiclePosition.parseFrom(record.value()).accessCode
                == positionRules.repeatFilter(record.partition())) 0 else 1},
              positionRules.positionJudge(VehiclePosition.parseFrom(record.value())))
          )
        })
      }
    })

    //ssc.checkpoint("/Users/kasim/workspace/")
    ssc.start()
    ssc.awaitTermination()
  }
}