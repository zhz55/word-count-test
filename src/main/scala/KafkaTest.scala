/**
  * Created by kasim on 2017/6/22.
  */

import java.text.SimpleDateFormat

import org.apache.spark.SparkConf
import org.apache.spark.streaming.Seconds
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.kafka010._
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe
import org.apache.spark.sql._
import ctitc.seagoing.SEAGOING._
import rules._

object KafkaTest {

  def main(args: Array[String]): Unit = {
   // val conf = new SparkConf().setAppName("KafkaSpark").setMaster("local[*]")
    val ssc = new StreamingContext("local[*]", "KafkaSpark", Seconds(10))

    val kafkaParams = Map[String, Object](
      "bootstrap.servers" -> "kf01:9092,kf02:9092,kf03:9092,kf04:9092,kf05:9092",
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[org.apache.kafka.common.serialization.ByteArrayDeserializer],
      "group.id" -> "scala_kafka_test1",
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
    //val kuduRules = new KuduRules
    val kuduContext = new KuduContext("nn01")

    /*
    stream.foreachRDD(rdd => {
      if(!rdd.isEmpty()) {
        val sparkSession = SparkSession.builder().config(rdd.sparkContext.getConf).getOrCreate()
        import sparkSession.implicits._

        if(rdd)
        kuduContext.insertIgnoreRows(rdd.map(record => recordintoschema(record)).toDF(),
          "")

          //import sparkSession.implicits._
          /*
          partitionRecords.map(record => {
            if(!{if(VehiclePosition.parseFrom(record.value()).accessCode
                  == positionRules.repeatFilter(record.partition())) false else true}) {
              kuduRules.insertKudu(VehiclePosition.parseFrom(record.value()),
                positionRules.positionJudge(VehiclePosition.parseFrom(record.value())).toString)
            }
          }) */


      }
    })
    */
    stream.foreachRDD(rdd => {
      if(!rdd.isEmpty()) {

      }
    })
/*

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
*/
    //ssc.checkpoint("/Users/kasim/workspace/")
    ssc.start()
    ssc.awaitTermination()
  }
}