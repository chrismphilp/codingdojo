package leet_code.easy

import org.scalatest.FunSuite

class LongestCommonPrefixTest extends FunSuite {
  test("Longest common prefix returns correct result") {
    assert(LongestCommonPrefix.longestCommonPrefix(Array("")) === "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("test", "tea")) === "te")
  }
}
