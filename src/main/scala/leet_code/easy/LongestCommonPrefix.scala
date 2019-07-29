package leet_code.easy

object LongestCommonPrefix {
  def longestCommonPrefix(words: Array[String]): String = {
    var currentMaxIndex: Int = words(0).length
    // Use merge sort
    words(0).substring(0, currentMaxIndex)
  }
}
