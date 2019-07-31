package leet_code.easy

import org.scalatest.FunSuite

class PalindromeTest extends FunSuite {
  test("Palindrome string returns correct result") {
    assert(Palindrome.isPalindromeString("11") === true)
    assert(Palindrome.isPalindromeString("0") === true)
    assert(Palindrome.isPalindromeString("5555") === true)
    assert(Palindrome.isPalindromeString("10501") === true)
    assert(Palindrome.isPalindromeString("112") === false)
    assert(Palindrome.isPalindromeString("-112") === false)
    assert(Palindrome.isPalindromeString("-5005") === true)
    assert(Palindrome.isPalindromeString("220176102") === false)
    assert(Palindrome.isPalindromeString("") === true)
    assert(Palindrome.isPalindromeString(" bbb  ") === true)
    assert(Palindrome.isPalindromeString("b a b") === true)
    assert(Palindrome.isPalindromeString("a,b,a") === true)
    assert(Palindrome.isPalindromeString("A man, a plan, a canal: Panama") === true)
    assert(Palindrome.isPalindromeString("TeEt") === true)
  }

  test("Palindrome number returns correct result") {
    assert(Palindrome.isPalindromeNumber(11) === true)
    assert(Palindrome.isPalindromeNumber(0) === true)
    assert(Palindrome.isPalindromeNumber(5555) === true)
    assert(Palindrome.isPalindromeNumber(10501) === true)
    assert(Palindrome.isPalindromeNumber(112) === false)
    assert(Palindrome.isPalindromeNumber(-112) === false)
    assert(Palindrome.isPalindromeNumber(-5005) === false)
    assert(Palindrome.isPalindromeNumber(220176102) === false)
    assert(Palindrome.isPalindromeNumber(555) === true)
  }
}
