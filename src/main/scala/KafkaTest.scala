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
    val ssc = new StreamingContext("local[2]", "KafkaSpark", Seconds(5))

    val kafkaParms = Map[String, Object](
      "bootstrap.servers" -> "kf01:9092,kf02:9092",
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[StringDeserializer],
      "group.id" -> "scala_kafka_test",
      "auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)
    )

    val topics = Array("LWLK_GNSS")
    val stream = KafkaUtils.createDirectStream[String, String](
      ssc,
      PreferConsistent,
      Subscribe[String, String](topics, kafkaParms)
    )

    stream.map(_.key()).print()

    //ssc.checkpoint("/Users/kasim/workspace/")
    ssc.start()
    ssc.awaitTermination()
  }
}
