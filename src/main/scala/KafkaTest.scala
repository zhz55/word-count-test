/**
  * Created by kasim on 2017/6/22.
  */
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.storage.StorageLevel

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.kafka010._
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe

object KafkaTest {
  def main(args: Array[String]): Unit = {
    val ssc = new StreamingContext("local[2]", "KafkaSpark", Seconds(10))

    val kafkaParms = Map[String, Object](
      //"bootstrap.servers" -> "172.16.111.1:9092, 172.16.111.2:9092, 172.16.111.3:9092, 172.16.111.4:9092, 172.16.111.5:9092",
      "bootstrap.servers" -> "10.1.88.151:9092",
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[StringDeserializer],
      "group.id" -> "scala_kafka_test",
      "auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)
    )

    val topics = Array("LWLK_POSITION", "HYPT_GNSS")
    val stream = KafkaUtils.createDirectStream[String, String](
      ssc,
      PreferConsistent,
      Subscribe[String, String](topics, kafkaParms)
    )

    stream.map(_.value()).print()

    //ssc.checkpoint("/Users/kasim/workspace/")
    ssc.start()
    ssc.awaitTermination()
  }
}
