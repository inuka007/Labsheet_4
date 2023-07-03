package Labsheet_3

import scala.io.StdIn.readInt

object Q2 {

  def PatternMatching(x: Int):String = x match{
    case x if(x <= 0) => "Negative/Zero";
    case x if(x % 2 == 0)  => "Even Number";
    case _ => "Odd Number";
  }

  def main(args: Array[String]): Unit = {
    printf("Enter the number: ")
    val input_1 = readInt();
    print(PatternMatching(input_1));
  }
}
