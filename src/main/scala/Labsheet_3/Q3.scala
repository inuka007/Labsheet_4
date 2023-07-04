
package Labsheet_3


object Q3{

  def toUpper(x: String): String = x.toUpperCase()
  def toLower(x: String): String = x.toLowerCase()

  def formatNames(name: String, format: String): String = {
    format match {
      case x if x=="alluppercase" => toUpper(name)
      case x if x=="First2Uppercase" => toUpper(name.substring(0, 2)) + toLower(name.substring(2,name.length))
      case x if x=="alllowercase" => toLower(name)
      case x if x=="firstandlastupper" => toUpper(name.head.toString) + toLower(name.substring(1,name.length-1)) + toUpper(name.substring(name.length-1))
    }
  }

  def main(args: Array[String]): Unit = {
    var names: List[String] = List("Benny", "Niroshan", "Saman", "Kumara")
    var formats: List[String] = List("alluppercase", "First2Uppercase", "alllowercase", "firstandlastupper")
    var i: Int = 0
    while (i < names.length) {
      println("original : " + names(i) + " => After format : " + formatNames(names(i), formats(i)))
      i = i + 1
    }: Unit
  }

}

