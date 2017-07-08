package rules

import java.text.SimpleDateFormat

import ctitc.seagoing.SEAGOING.VehiclePosition
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kudu.spark.kudu._
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType

/**
  * Created by Kasim on 2017/7/6.
  */
class KuduRules extends Serializable {

  // RDD->DataFrame
  case class TableStructureVehiclePosition(vehicleno : String, platecolor : Int,
                                           positiontime : Long, accesscode : Int,
                                           city : Int, curaccesscode : Int,
                                           trans : Int, updatetime : Long,
                                           encrypt : Int, lon : Int, lat : Int,
                                           vec1 : Int, vec2 : Int, vec3 : Int,
                                           direction : Int, altitude : Int,
                                           state : Long, alarm : Long,
                                           reserved : String, errorcode : String,
                                           roadcode : Int)

  def insertKudu(vehiclePosition: VehiclePosition, errorOrNot: String) : TableStructureVehiclePosition = {
    new TableStructureVehiclePosition(
      vehiclePosition.vehicleNo.trim(), vehiclePosition.getPlateColor,
      // Date->UnixTime
      {if("^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}$".r.pattern.matcher(vehiclePosition.gnss.positionTime).matches())
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(vehiclePosition.gnss.positionTime).getTime / 1000
      else 0}, vehiclePosition.accessCode,
      vehiclePosition.city, vehiclePosition.getCurAccessCode,
      vehiclePosition.getTrans, vehiclePosition.updateTime,
      vehiclePosition.gnss.getEncrypt, vehiclePosition.gnss.lon, vehiclePosition.gnss.lat,
      vehiclePosition.gnss.getVec1, vehiclePosition.gnss.getVec2, vehiclePosition.gnss.getVec3,
      vehiclePosition.gnss.getDirection, vehiclePosition.gnss.getAltitude,
      vehiclePosition.gnss.getState, vehiclePosition.gnss.getAlarm,
      vehiclePosition.getReserved, errorOrNot, 0)
  }

  def testPartitions(iterator: Iterator[ConsumerRecord()]) : Any = {

  }
}
