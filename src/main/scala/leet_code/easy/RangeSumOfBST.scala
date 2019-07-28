package leet_code.easy

import scala.annotation.tailrec

/*
Given the root node of a binary search tree, return the sum
of values of all nodes with value between L and R (inclusive).
 */

object RangeSumOfBST {
  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    def recursiveTreeSearcher(root: TreeNode): Int = {
      Option(root) match {
        case Some(_) =>
          if (root.value >= L && root.value <= R) {
            root.value + recursiveTreeSearcher(root.left) + recursiveTreeSearcher(root.right)
          }
          else if (root.value >= R) recursiveTreeSearcher(root.left)
          else if (root.value <= L) recursiveTreeSearcher(root.right)
          else 0
        case None => 0
      }
    }
    recursiveTreeSearcher(root)
  }
}

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}