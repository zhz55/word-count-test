package rules

/**
  * Created by Kasim on 2017/6/26.
  */
import scala.util.matching.Regex.Match
import scala.collection._

import ctitc.seagoing.SEAGOING._

class PositionRules() extends Serializable{

  val provSet = Set("京","吉","辽","蒙","晋","冀",
    "津","新","宁","青","甘","陕", "藏","云","贵",
    "川","渝","琼", "桂","粤","湘","鄂","皖","鲁",
    "赣","闽","豫","浙","苏","沪","黑")

  def repeatFilter(int:Int) : Int = {
    if(int == 1) 110000
    else if(int == 2) 120000
    else if(int == 3) 130000
    else if(int == 4) 140000
    else if(int == 5) 150000
    else if(int == 6) 210000
    else if(int == 7) 220000
    else if(int == 8) 230000
    else if(int == 9) 310000
    else if(int == 10) 320000
    else if(int == 11) 330000
    else if(int == 12) 340000
    else if(int == 13) 350000
    else if(int == 14) 360000
    else if(int == 15) 370000
    else if(int == 16) 410000
    else if(int == 17) 420000
    else if(int == 18) 430000
    else if(int == 19) 440000
    else if(int == 20) 450000
    else if(int == 21) 460000
    else if(int == 22) 500000
    else if(int == 23) 510000
    else if(int == 24) 520000
    else if(int == 25) 530000
    else if(int == 26) 540000
    else if(int == 27) 610000
    else if(int == 28) 620000
    else if(int == 29) 630000
    else if(int == 30) 640000
    else if(int == 31) 650000
    else if(int == 0) 0
    else 0
  }

  // 1001 车牌长度小于6或大于10
  // 1002 车牌第一位错误
  // 1003 车牌不符合规则
  // 1101 车牌颜色不是1,2,3,4,8,9
  // 1202 经度错误
  // 1203 纬度错误
  // 1302 海拔低于负200米或高于6000米
  // 1402 速度小于0或者大于160
  // 1502 方向小于0或者大于360
  // 1601 时间格式错误
  // 1602 接收时间早于定位时间
  def positionJudge(vehiclePosition: VehiclePosition) : AnyVal = {
    var rslt = new Array[Byte](12)
    // 1001
    if( (10 < vehiclePosition.vehicleNo.length()) || (vehiclePosition.vehicleNo.length() < 6)) rslt(0) = 1
    else rslt(0) = 0
    // 1002




  }
}
