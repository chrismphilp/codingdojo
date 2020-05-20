package project_euler

object MultiplesOf3And5 {
  def calculateSum(curr: Int, maxValue: Int): Int = curr match {
    case `maxValue` => 0
    case `curr` if (curr % 3) == 0 | (curr % 5) == 0 =>
      curr + calculateSum(curr + 1, maxValue)
    case _ =>
      calculateSum(curr + 1, maxValue)
  }
}
