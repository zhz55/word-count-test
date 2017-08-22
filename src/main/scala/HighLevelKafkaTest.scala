import ctitc.seagoing.SEAGOING.VehiclePosition
import kafka.serializer.{Decoder, StringDecoder}
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by kasim on 2017/8/22.
  */

object HighLevelKafkaTest {
  def main(args: Array[String]): Unit = {
    val ssc = new StreamingContext("yarn", "HighLevelKafkaTest", Seconds(10))

    val kafkaParams = Map[String, String](
      "group.id" -> "HighLevelKafkaTest",
      "zookeeper.connect" -> "dn01:2181"
    )

    val topics = Array("LWLK_POSITION").map((_, 32)).toMap

    val stream = KafkaUtils.createStream[String,Array[Byte],StringDecoder,Decoder[Array[Byte]]](
      ssc,
      kafkaParams,
      topics,
      StorageLevel.MEMORY_AND_DISK_SER_2)

    stream.foreachRDD(rdd => {
      rdd.foreachPartition(partitionRecords => {
        partitionRecords.map(record => {
          println(record._1, VehiclePosition.parseFrom(record._2).accessCode)
        })
      })
    })

    ssc.start()
    ssc.awaitTermination()
  }
}
