package leet_code.easy

object MovingStonesUntilConsecutive {
  def numMovesStones(a: Int, b: Int, c: Int): Array[Int] = {
    val sortedValues: Array[Int] = Array(a, b, c).sorted
    val newA = sortedValues(0)
    val newB = sortedValues(1)
    val newC = sortedValues(2)

    if (newA == newC - 2) Array(0, 0)
    else {
      val lower = newB - 1 - newA
      val upper = newC - 1 - newB
      var min = (if (lower == 0) 0 else 1) + (if (upper == 0) 0 else 1)
      if (newC - newB == 2 || newC - newA == 2 || newB - newA == 2) min = 1
      Array(min, upper + lower)
    }
  }
}
