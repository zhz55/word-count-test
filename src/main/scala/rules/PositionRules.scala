package rules

/**
  * Created by Kasim on 2017/6/26.
  */
import ctitc.seagoing.SEAGOING._

class PositionRules() extends Serializable{
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

  def positionJudge(vehiclePosition: VehiclePosition) : AnyVal = {

  }
}
