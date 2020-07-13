package leet_code.easy

import org.scalatest.funsuite.AnyFunSuite

class UniqueMorseCodeWordsTest extends AnyFunSuite {
  test("Correct translation number of Morse Codes should be returned") {
    val words = Array("gin", "zen", "gig", "msg")
    assert(UniqueMorseCodeWords.uniqueMorseRepresentations(words) == 2)
  }
}
