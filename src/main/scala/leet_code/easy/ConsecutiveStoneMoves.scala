package leet_code.easy

object ConsecutiveStoneMoves {
  def numMovesStones(a: Int, b: Int, c: Int): Array[Int] = {
    var finalValues: Array[Int] = Array(a, b, c).sorted
    if (a == c - 2) Array(0, 0)

    def findMinAndMax(a: Int, c: Int, min: Int, max: Int): Array[Int] = (a, c) match {
      case (x, y) if x == y - 2 => Array(min, max)
      case (x, y) if b - x > y - b  => findMinAndMax(a + 1, c, min + 1, max)
    }
    finalValues
  }
}
