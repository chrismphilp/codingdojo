package leet_code.easy

object LongestCommonPrefix {
  def longestCommonPrefix(words: Array[String]): String = {
    if (words.length == 0) return ""

    val initialWord = words(0)
    val maxIndex: Int = initialWord.length
    var currentIndex: Int = 0

    for (_ <- 0 until maxIndex) {
      val currentCharacter = initialWord(currentIndex)
      for (word <- words) {
        if (word.length == currentIndex || word(currentIndex) != currentCharacter) {
          return initialWord.substring(0, currentIndex)
        }
      }
      currentIndex += 1
    }
    initialWord.substring(0, currentIndex)
  }
}
