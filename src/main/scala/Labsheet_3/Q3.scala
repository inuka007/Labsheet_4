package Labsheet_3

import scala.io.StdIn.readInt

object Q3 {

  def toUpper(x: String):String = x.toUpperCase;
  def toLower(x: String):String = x.toLowerCase;
  def formatNames(name: String)(formatter: String => String):String = formatter(name);

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(toUpper))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(toUpper))

    }


}
