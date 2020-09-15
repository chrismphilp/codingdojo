package project_euler

import scala.collection.mutable.ArrayBuffer

object SummationOfPrimes {
  def sieveOfEratosthenes(max: Int): Double = {
    val primeIndices = ArrayBuffer.fill(max / 2)(1)
    val intSqrt = Math.sqrt(max).toInt
    for (i <- 3 to max by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to max by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }
    var sum: Double = 0
    for (i <- primeIndices.indices if primeIndices(i) == 1) {
      sum += 2 * i + 1
    }
    sum + 1
  }
}
