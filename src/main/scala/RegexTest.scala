/**
  * Created by Kasim on 2017/7/4.
  */

object RegexTest {
  def main(args: Array[String]): Unit = {
    val stringTest = "2017-07-22 00:00:00"
    val stringTest1 = "2017-06-322 00:00:00"
    val stringTest2 = "2017-06-28 0  0:00:00"
    val stringTest3 = "2017-06-28   00:00:00"
    val stringTest4 = "201%-06-28 00:00:00"
      //"湘DA6847"
    //println(stringTest.substring(0, 1))
    //println(stringTest.substring(1, 2))

    //val regex = "^[A-Z]+[A-Z0-9]+[A-Z0-9挂学]$".r

    val regex = "^\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}$".r
    val matches = regex.pattern.matcher(stringTest)
    val matches1 = regex.pattern.matcher(stringTest1)
    val matches2 = regex.pattern.matcher(stringTest2)
    val matches3 = regex.pattern.matcher(stringTest3)
    val matches4 = regex.pattern.matcher(stringTest4)
    println(matches.matches())
    println(matches1.matches())
    println(matches2.matches())
    println(matches3.matches())
    println(matches4.matches())


  }

}
