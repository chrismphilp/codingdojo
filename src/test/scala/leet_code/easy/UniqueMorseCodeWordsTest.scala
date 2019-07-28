package leet_code.easy

import org.scalatest.FunSuite

class UniqueMorseCodeWordsTest extends FunSuite {
  test("Correct translation number of Morse Codes should be returned") {
    val words = Array("gin", "zen", "gig", "msg")
    assert(UniqueMorseCodeWords.uniqueMorseRepresentations(words) == 2)
  }
}
