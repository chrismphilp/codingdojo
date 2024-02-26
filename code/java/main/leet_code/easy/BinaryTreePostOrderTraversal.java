package leet_code.easy;

import java.util.LinkedList;
import java.util.List;
import leet_code.util.TreeNode;

public class BinaryTreePostOrderTraversal {

  public List<Integer> postorderTraversal(TreeNode root) {
    if (root == null) {
      return List.of();
    }

    List<Integer> elements = new LinkedList<>();
    postorderTraversal(root, elements);
    return elements;
  }

  private void postorderTraversal(TreeNode root, List<Integer> elements) {
    if (root.left != null) {
      postorderTraversal(root.left, elements);
    }
    if (root.right != null) {
      postorderTraversal(root.right, elements);
    }

    elements.add(root.val);
  }
}
