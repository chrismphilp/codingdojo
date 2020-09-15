package project_euler

object EvenValuedFibonacci {
  def calculateSum(firstVal: Int, secondVal: Int, maxValue: Int): Int = secondVal match {
    case _ if secondVal >= `maxValue` => 0
    case _ if secondVal % 2 == 0 => secondVal + calculateSum(secondVal, firstVal + secondVal, maxValue)
    case _ => calculateSum(secondVal, firstVal + secondVal, maxValue)
  }
}
