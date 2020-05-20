package leet_code.easy

object LengthOfLastWord {
  def lengthOfLastWord(s: String): Int = {
    var count = 0
    for (i <- (0 until s.length).reverse) {
      if (s.charAt(i).equals(' ')) {
        if (count != 0) return count
      } else count += 1
    }
    count
  }
}
