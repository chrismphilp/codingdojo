package leet_code.easy

import scala.annotation.tailrec

object Palindrome {
  def isPalindromeString(s: String): Boolean = {
    val newString = s.filter(_.isLetterOrDigit).toLowerCase
    for (i <- 0 until newString.length) if (newString(i) != newString(newString.length - i - 1)) return false
    true
  }

  def isPalindromeNumber(x: Int): Boolean = {
    @tailrec
    def checkIsPalindrome(x: Int, y: Int): Int = x match {
      case 0 => y
      case _ => checkIsPalindrome(x / 10, (y * 10) + (x % 10))
    }

    if (x < 0) false
    else x == checkIsPalindrome(x, 0)
  }

  def isPalindromeSinglyLinkedList(head: ListNode): Boolean = {
    @tailrec
    def getListSize(head: ListNode, size: Int = 0): Int = Option(head) match {
      case None => size
      case Some(_) => getListSize(head.next, size + 1)
    }

    @tailrec
    def checkReversedList(middleLeft: ListNode, middleRight: ListNode): Boolean = (Option(middleLeft), Option(middleRight)) match {
      case (_, None) => true
      case (Some(x), Some(y)) if x.x != y.x => false
      case (Some(x), Some(y)) => checkReversedList(x.next, y.next)
    }


    val listSize: Int = getListSize(head)
    if (listSize <= 1) return true

    var prev: ListNode = head
    var current: ListNode = prev

    for (_ <- 0 until listSize / 2) {
      val x: ListNode = current.next
      current.next = prev
      prev = current
      current = x
    }

    if (listSize % 2 != 0) current = current.next
    checkReversedList(prev, current)
  }
}

class ListNode(_x: Int = 0) {
  var next: ListNode = _
  var x: Int = _x
}
