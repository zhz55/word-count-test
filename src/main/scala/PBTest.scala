/**
  * Created by kasim on 2017/6/25.
  */

import ctitc.seagoing.SEAGOING._

object PBTest{
  def main(args: Array[String]): Unit = {
    val tmp = Gnss(Option(1),"1111",111,111,Option(1),Option(1),
      Option(1),Option(1),Option(1),Option(1),Option(1)).toByteString

    println(tmp)

    //println(Gnss.fromAscii(tmp).getAltitude)
    //println(Gnss.parseFrom(tmp))

    //println(Gnss.parseFrom(tmp.getBytes()))


  }
}
