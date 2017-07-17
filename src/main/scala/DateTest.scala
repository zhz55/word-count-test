import java.text.{ParseException, SimpleDateFormat}
import java.util.{Calendar, Date, TimeZone}

/**
  * Created by Kasim on 2017/7/4.
  */
object DateTest {
  def main(args: Array[String]): Unit = {
    val timeStamp = "2017-11-21 01:12:00"
    val unixTime = 1499134652
    try {
      val test = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS")
      println(test.parse(timeStamp).getTime / 1000)
    }
    catch {
      case e:ParseException => println("error")
    }

    val now = new Date()
    println(now)

    val day = String.format("%td", now) match {
      case "01" => "1"
      case "02" => "1"
      case "03" => "1"
      case "04" => "1"
      case "05" => "1"
      case "06" => "1"
      case "07" => "1"
      case "08" => "1"
      case "09" => "2"
      case "10" => "2"
      case "11" => "2"
      case "12" => "2"
      case "13" => "2"
      case "14" => "2"
      case "15" => "2"
      case "16" => "2"
      case "17" => "3"
      case "18" => "3"
      case "19" => "3"
      case "20" => "3"
      case "21" => "3"
      case "22" => "3"
      case "23" => "3"
      case "24" => "3"
      case "25" => "4"
      case "26" => "4"
      case "27" => "4"
      case "28" => "4"
      case "29" => "4"
      case "30" => "4"
    }
    println(day)
    println((String.format("%tY", now).toLong -1).toString)
    println((String.format("%tm", now).toLong -1).toString)
    //println(String.format("%te", now))
    //println(String.format("%td", now))

    val tablename = "1"
    val tablename1 = "11"

    println(tablename.matches("1"))
    println(tablename1.matches("1"))

    val nowC = Calendar.getInstance()
    println(nowC)
    val tmp:Long = 1499687932
    val tmp1 = tmp * 1000
    println(tmp1)
    println(new Date(tmp))
    println(new Date(tmp * 1000))
    println(new Date(tmp1))
    //nowC.add(Calendar.MONTH, -8)
    //nowC.setTime(new Date(unixTime))
    //println(new Date(unixTime * 1000))
    //println(nowC.getTime)

    def acrossTableFlag() : Array[String] = {
      //"impala::position.CTTIC_VehiclePosition_201707_err_test"
      // tableArray[0] : correctNowTableName
      // tableArray[1] : errNowTableName
      // tableArray[2] : correctAcrossTableName
      // tableArray[3] : errAcrossTableName
      val tableArray = new Array[String](4)

      val now = Calendar.getInstance()

      val tableNum = now.get(Calendar.DAY_OF_MONTH) match {
        case i if i < 9 => 1
        case i if (i > 8) && (i < 17) => 2
        case i if (i > 16) && (i < 25) => 3
        case i if i > 24 => 4
      }

      def monthAddZero(int: Int) : String = {
        if(int < 10) "0" + int.toString
        else int.toString
      }

      tableArray(0) = "impala::position.CTTIC_VehiclePosition_" + now.get(Calendar.YEAR).toString +
        monthAddZero(now.get(Calendar.MONTH) + 1) + "_" + tableNum.toString + "_test"
      tableArray(1) = "impala::position.CTTIC_VehiclePosition_" + now.get(Calendar.YEAR).toString +
        monthAddZero(now.get(Calendar.MONTH) + 1) + "_err_test"

      // across table
      // across month
      if(tableNum == 1) {
        now.add(Calendar.MONTH, -1)
        tableArray(2) = "impala::position.CTTIC_VehiclePosition_" + now.get(Calendar.YEAR).toString +
          monthAddZero(now.get(Calendar.MONTH) + 1) + "_4_test"
        tableArray(3) = "impala::position.CTTIC_VehiclePosition_" + now.get(Calendar.YEAR).toString +
          monthAddZero(now.get(Calendar.MONTH) + 1) + "_err_test"
      } else {
        tableArray(2) = "impala::position.CTTIC_VehiclePosition_" + now.get(Calendar.YEAR).toString +
          monthAddZero(now.get(Calendar.MONTH) + 1) + "_" + (tableNum - 1).toString + "_test"
        tableArray(3) = tableArray(1)
      }

      tableArray
    }
    println(acrossTableFlag()(0))
    println(acrossTableFlag()(1))
    println(acrossTableFlag()(2))
    println(acrossTableFlag()(3))

    val calendar = Calendar.getInstance()
    //calendar.setTime(new Date())
    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) -1)
    calendar.set(Calendar.HOUR_OF_DAY, 0)
    calendar.set(Calendar.MINUTE, 0)
    calendar.set(Calendar.SECOND, 0)

    println(calendar.getTimeInMillis / 1000)

    println((System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault.getRawOffset - 86400000)/1000)

    def oneDayPeriod() : Long = {
      // first way
      /*
      val calendar = Calendar.getInstance()
      calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) -1)
      calendar.set(Calendar.HOUR_OF_DAY, 0)
      calendar.set(Calendar.MINUTE, 0)
      calendar.set(Calendar.SECOND, 0)
      calendar.getTimeInMillis / 1000
      */
      // second way
      (System.currentTimeMillis()/(1000*3600*24)*(1000*3600*24) - TimeZone.getDefault.getRawOffset - 86400000)/1000
    }

    println(oneDayPeriod())

    val sql = "select * from one_day_kudu_data_table where positiontime > " + (oneDayPeriod() - 1).toString +
      " and positiontime < " + (oneDayPeriod() + 86400).toString

    println(sql)

    def getTableNum(int: Int) : Int = {
      int match  {
        case i if i < 9 => 1
        case i if (i > 8) && (i < 17) => 2
        case i if (i > 16) && (i < 25) => 3
        case i if i > 24 => 4
      }
    }

    def crossTableFlag(long: Long) : Boolean = {
      val calendar = Calendar.getInstance()

      val tableNum = getTableNum(calendar.get(Calendar.DAY_OF_MONTH))

      calendar.setTime(new Date(long))

      if(tableNum == getTableNum(calendar.get(Calendar.DAY_OF_MONTH))) false
      else true
    }

    val testunixtime = 1499388484

    println(crossTableFlag(testunixtime * 1000))

  }

}
