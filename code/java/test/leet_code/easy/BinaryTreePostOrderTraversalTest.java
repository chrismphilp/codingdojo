package leet_code.easy;

import static org.junit.Assert.assertEquals;

import java.util.List;
import leet_code.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreePostOrderTraversalTest {

  private BinaryTreePostOrderTraversal underTest;

  @Before
  public void setup() {
    underTest = new BinaryTreePostOrderTraversal();
  }

  @Test
  public void should_return_true_for_null_root() {
    assertEquals(List.of(), underTest.postorderTraversal(null));
  }

  @Test
  public void should_return_correct_result_for_example_one() {
    TreeNode root = new TreeNode(1);
    // LHS
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    // RHS
    TreeNode node4 = new TreeNode(5);
    TreeNode node5 = new TreeNode(6);
    TreeNode node6 = new TreeNode(7);
    TreeNode node7 = new TreeNode(8);

    // LHS
    root.right = node1;
    node1.left = node2;
    node1.right = node4;

    // LHS
    node2.left = node5;
    node2.right = node6;

    node4.right = node7;

    assertEquals(List.of(6, 7, 3, 8, 5, 2, 1), underTest.postorderTraversal(root));
  }
}