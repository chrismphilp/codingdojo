package project_euler

object LargestPalindromeProduct {
  def getLargestPalindrome(maxValue: Int): Int = {
    var currentMax = 0
    for (x <- maxValue to 100 by -1; if isPalindromeNumber(x)) {
      for (y <- 100 to 999) {
        if (x % y == 0 && x > currentMax && numberOfDigits(x / y, 0) == 3) {
          currentMax = x
        }
      }
    }
    currentMax
  }

  def isPalindromeNumber(value: Int): Boolean = {
    val noOfDigits = numberOfDigits(value, 0)
    val noToSplitAt: Int = math.floor(noOfDigits / 2).toInt
    val newString: (String, String) = if (noOfDigits % 2 == 0)
      value.toString.splitAt(noToSplitAt)
    else
      (value.toString.take(noToSplitAt),
        value.toString.slice(noToSplitAt + 1, noOfDigits))
    if (newString._1.reverse == newString._2) true
    else false
  }

  def numberOfDigits(value: Int, digits: Int): Int = value match {
    case _ if value > 0 => numberOfDigits(value / 10, digits + 1)
    case _ => digits
  }
}
