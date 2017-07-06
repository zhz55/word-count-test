import java.text.{ParseException, SimpleDateFormat}

/**
  * Created by Kasim on 2017/7/4.
  */
object DateTest {
  def main(args: Array[String]): Unit = {
    val timeStamp = "2017-11-21 00:00:00"
    val unixTime = 1499134652
    try {
      val test = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS")
      println(test.parse(timeStamp).getTime / 1000)

      val stringTest = "0000010010"
      println(stringTest.contains("1"))
    }
    catch {
      case e:ParseException => println("error")
    }

  }

}
