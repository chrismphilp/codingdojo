package leet_code.easy

import org.scalatest.FunSuite

class LongestCommonPrefixTest extends FunSuite {
  test("Longest common prefix returns correct result") {
    assert(LongestCommonPrefix.longestCommonPrefix(Array("")) === "")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("test", "tea")) === "te")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("test", "test", "test")) === "test")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("te", "test", "test")) === "te")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("brandy", "bra", "brundy")) === "br")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("aa", "a")) === "a")
    assert(LongestCommonPrefix.longestCommonPrefix(Array("aaaaa", "aaa", "a")) === "a")
  }
}
