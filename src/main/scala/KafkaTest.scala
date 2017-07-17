/**
  * Created by kasim on 2017/6/22.
  */

import kafka.serializer.StringDecoder
import org.apache.kafka.clients.consumer.{ConsumerRecord, KafkaConsumer}
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.rdd.RDD
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.kafka010.KafkaUtils
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.ConsumerStrategies._
import stores.{OffsetsStore, ZooKeeperOffsetsStore}

object KafkaTest {

  def main(args: Array[String]): Unit = {

    val ssc = new StreamingContext("local[2]", "KafkaSpark", Seconds(10))

    val kafkaParams = Map[String, Object](
      "bootstrap.servers" -> "zk01:9092,zk02:9092,zk00:9092",
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[StringDeserializer],
      "group.id" -> "scala_kafka_test2",
      "auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)
    )

    def kafkaStream(ssc: StreamingContext, kafkaParams: Map[String, Object], offsetsStore: OffsetsStore, topic: String): InputDStream[ConsumerRecord[String, String]] = {

      val topics = Set(topic)

      val storedOffsets = offsetsStore.readOffsets(topic)

      val kafkaStream = storedOffsets match {
        case None =>
          // start from the latest offsets
          KafkaUtils.createDirectStream[String, String](
            ssc,
            PreferConsistent,
            Subscribe[String, String](topics, kafkaParams))
        case Some(fromOffsets) =>
          // start from previously saved offsets
          KafkaUtils.createDirectStream[String, String](
            ssc,
            PreferConsistent,
            Subscribe[String, String](topics, kafkaParams, fromOffsets))
      }

      // save the offsets
      kafkaStream.foreachRDD(rdd => offsetsStore.saveOffsets(topic, rdd))

      kafkaStream
    }

    val topics = Array("ZK_TEST_1", "ZK_TEST_2")
    val zkHosts = "zk00:2181,zk01:2181,zk02:2181"
    val zkPath1 = "/ZK_TEST/LOGS/3"
    val zkPath2 = "/ZK_TEST/LOGS/4"

    val stream1 = kafkaStream(ssc, kafkaParams, new ZooKeeperOffsetsStore(zkHosts, zkPath1), topics(0))
    val stream2 = kafkaStream(ssc, kafkaParams, new ZooKeeperOffsetsStore(zkHosts, zkPath2), topics(1))

    stream1.union(stream2).foreachRDD(rdd => {
      rdd.foreachPartition(partitionRecord => {
        partitionRecord.foreach(println(_))
      })
    })

    ssc.start()
    ssc.awaitTermination()
  }
}