package leet_code.easy

import scala.collection.mutable

object UniqueMorseCodeWords {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val wordStore: mutable.HashSet[String] = new mutable.HashSet[String]
    val morseValues: Array[String] = Array(
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    )
    for (word <- words) {
      var temporaryWord: String = ""
      for (c <- word) {
        temporaryWord += morseValues(c - 'a')
      }
      wordStore.add(temporaryWord)
    }
    wordStore.size
  }
}
