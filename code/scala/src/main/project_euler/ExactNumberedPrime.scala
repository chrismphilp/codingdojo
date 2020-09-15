package project_euler

import scala.annotation.tailrec

object ExactNumberedPrime {
  @tailrec
  def getExactNumberedPrime(value: Int, count: Int, curr: Int): Int = (value, count, curr) match {
    case x if x._1 == x._2 => x._3 - 1
    case x if isEven(x._3) => getExactNumberedPrime(x._1, x._2, x._3 + 1)
    case x if isPrime(x._3) => getExactNumberedPrime(x._1, x._2 + 1, x._3 + 1)
    case x => getExactNumberedPrime(x._1, x._2, x._3 + 1)
  }

  def isPrime(value: Int): Boolean = {
    for (x <- 2 until value - 1 by 1 if value % x == 0) return false
    true
  }

  def isEven(value: Int): Boolean = value % 2 == 0
}
