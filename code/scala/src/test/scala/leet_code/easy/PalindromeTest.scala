package leet_code.easy

class PalindromeTest extends FunSuite {
  test("String is palindrome") {
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

  test("Number is palindrome") {
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

  test("Singly linked list is palindrome") {
    val testList: ListNode = new ListNode(0)
    val nextNode: ListNode = new ListNode(5)
    val finalNode: ListNode = new ListNode(1)
    testList.next = nextNode
    nextNode.next = finalNode
    assert(Palindrome.isPalindromeSinglyLinkedList(testList) === false)
    assert(Palindrome.isPalindromeSinglyLinkedList(finalNode) === true)
  }
}
