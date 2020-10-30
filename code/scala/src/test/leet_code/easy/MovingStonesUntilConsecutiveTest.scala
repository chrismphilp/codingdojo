package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class MovingStonesUntilConsecutiveTest extends AnyFunSuite {
  test("Should return correct result for example one") {
    val finalValues: Array[Int] = MovingStonesUntilConsecutive.numMovesStones(1, 2, 5)
    assert(finalValues(0) == 1)
    assert(finalValues(1) == 2)
  }

  test("Should return correct result for example two") {
    val finalValues: Array[Int] = MovingStonesUntilConsecutive.numMovesStones(4, 3, 2)
    assert(finalValues(0) == 0)
    assert(finalValues(1) == 0)
  }

  test("Should return correct result for example three") {
    val finalValues: Array[Int] = MovingStonesUntilConsecutive.numMovesStones(3, 5, 1)
    assert(finalValues(0) == 1)
    assert(finalValues(1) == 2)
  }
}
