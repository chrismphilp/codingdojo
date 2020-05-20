package project_euler

object SmallestMultipleDivisable {
  def getSmallestPositiveInteger(currentValue: Int, divisor: Int, maxValue: Int): Int =
    (currentValue, divisor, maxValue) match {
      case (curr, 10, _) => curr
      case (curr, div, max) if curr % div == 0 => getSmallestPositiveInteger(curr, div - 1, max)
      case (curr, div, max) if curr % div != 0 => getSmallestPositiveInteger(curr + 1, max, max)
    }
}
