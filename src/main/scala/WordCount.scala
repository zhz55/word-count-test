/**
  * Created by Kasim on 2017/6/22.
  */

import scala.io.Source

object WordCount {
  def main(args: Array[String]): Unit = {

    val words = Source.fromFile("D:\\110000.data").getLines().
      map(line => line.split(",")(0)).map(word => (word, 1))

    words.toList.groupBy(_._1).map {
      case (word, list) => (word, list.size)
    }.foreach(println)
/*
    val wordsMap = scala.collection.mutable.Map[String, Int]()
    val lines = Source.fromFile("D:\\110000.data").getLines()
    lines.map(line => line.split(",")(0)).foreach(
      word => {
        if (wordsMap.contains(word)) {
          wordsMap(word) += 1
        } else {
          wordsMap += (word -> 1)
        }
      }
    )

    for((k,v)<-wordsMap) println(k+": "+v)
    */
  }
}