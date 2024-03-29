package leet_code.easy;

import leet_code.util.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        else return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
