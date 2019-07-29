package leet_code.easy

import org.scalatest.FunSuite

class LengthOfLastWordTest extends FunSuite {
  test("Correct length of the last work in the string should be returned") {
    assert(LengthOfLastWord.lengthOfLastWord("we know") == 4)
    assert(LengthOfLastWord.lengthOfLastWord("") == 0)
    assert(LengthOfLastWord.lengthOfLastWord("e") == 1)
    assert(LengthOfLastWord.lengthOfLastWord("e ") == 1)
    assert(LengthOfLastWord.lengthOfLastWord("testy") == 5)
    assert(LengthOfLastWord.lengthOfLastWord("a b c d e") == 1)
  }
}
