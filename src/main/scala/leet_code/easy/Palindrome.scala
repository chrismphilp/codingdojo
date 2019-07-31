package leet_code.easy

import scala.annotation.tailrec

object Palindrome {
  def isPalindromeString(s: String): Boolean = {
    val newString = s.filter(_.isLetterOrDigit).toLowerCase
    for (i <- 0 until newString.length) if (newString(i) != newString(newString.length - i - 1)) return false
    true
  }

  def isPalindromeNumber(x: Int): Boolean = {
    @tailrec
    def checkIsPalindrome(x: Int, y: Int): Int = x match {
      case 0 => y
      case _ => checkIsPalindrome(x / 10, (y * 10) + (x % 10))
    }

    if (x < 0) false
    else x == checkIsPalindrome(x, 0)
  }
}
