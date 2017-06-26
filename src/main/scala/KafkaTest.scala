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

    stream.foreachRDD(rdd => {
      if(!rdd.isEmpty()) {
        rdd.foreachPartition(partitionRecords => {
          partitionRecords.map(record => (record.partition(), VehiclePosition.parseFrom(record.value()))).filter(data => {
            data._2.accessCode == (
              if(data._1 == 1) 110000
              else if(data._1 == 2) 120000
              else if(data._1 == 3) 130000
              else if(data._1 == 4) 140000
              else if(data._1 == 5) 150000
              else if(data._1 == 6) 210000
              else if(data._1 == 7) 220000
              else if(data._1 == 8) 230000
              else if(data._1 == 9) 310000
              else if(data._1 == 10) 320000
              else if(data._1 == 11) 330000
              else if(data._1 == 12) 340000
              else if(data._1 == 13) 350000
              else if(data._1 == 14) 360000
              else if(data._1 == 15) 370000
              else if(data._1 == 16) 410000
              else if(data._1 == 17) 420000
              else if(data._1 == 18) 430000
              else if(data._1 == 19) 440000
              else if(data._1 == 20) 450000
              else if(data._1 == 21) 460000
              else if(data._1 == 22) 500000
              else if(data._1 == 23) 510000
              else if(data._1 == 24) 520000
              else if(data._1 == 25) 530000
              else if(data._1 == 26) 540000
              else if(data._1 == 27) 610000
              else if(data._1 == 28) 620000
              else if(data._1 == 29) 630000
              else if(data._1 == 30) 640000
              else if(data._1 == 31) 650000
              else if(data._1 == 0) 0
              else 0)
          }).foreach(data => println(data._2.accessCode))
            //foreach(data => {
            //VehiclePosition.parseFrom(data.value())
          //})
        })
      }
    })

    //ssc.checkpoint("/Users/kasim/workspace/")
    ssc.start()
    ssc.awaitTermination()
  }
}
