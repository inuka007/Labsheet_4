package Labsheet_3

import scala.io.StdIn.readFloat

object Q1 {
  def interest(x: Double): Double = x match{
    case x if(x <= 20000) => x * .02;
    case x if(x <= 200000) => x * .04;
    case x if(x <= 2000000) => x * .035;
    case x if(x >= 2000000) => x * .065;
  }

  def round(y: Double): Double = BigDecimal(y).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;

  def main(args: Array[String]): Unit = {
    printf("Enter the deposit amount: ")
    val input_1 = readFloat();
    var y: Double = interest(input_1);
    print("Interest is Rs. "+ round(y));
  }
}
