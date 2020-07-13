package project_euler

object SumSquareDifference {
  def getSumSquareDifference(value: Int): Int = {
    math.abs(sumOfSquares(value) - squareOfSums(value))
  }

  def sumOfSquares(maxValue: Int): Int = {
    var sum: Int = 0
    for (x <- 1 to maxValue) sum = sum + (x * x)
    sum
  }

  def squareOfSums(maxValue: Int): Int = {
    var sum: Int = 0
    for (x <- 1 to maxValue) sum = sum + x
    sum * sum
  }
}
