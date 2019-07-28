package leet_code.easy

import org.scalatest.FunSuite

/*
Given the root node of a binary search tree, return the sum
of values of all nodes with value between L and R (inclusive).
 */

class RangeSumOfBSTTest extends FunSuite {
  test("Correct sum of BST should be returned") {
    val testTree = new TreeNode(15)
    val leftNode = new TreeNode(8)
    val rightNode = new TreeNode(25)
    testTree.left = leftNode
    testTree.right = rightNode

    assert(RangeSumOfBST.rangeSumBST(testTree, 8, 10) == 8)
    assert(RangeSumOfBST.rangeSumBST(testTree, 8, 15) == 23)
    assert(RangeSumOfBST.rangeSumBST(testTree, 9, 10) == 0)
  }
}
