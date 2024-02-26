package leet_code.easy;

import leet_code.util.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return isUnivalTree(root, root.val);
    }

    private boolean isUnivalTree(TreeNode node, int value) {
        if (node == null) return true;
        else if (node.val != value) return false;
        else return isUnivalTree(node.left, value) && isUnivalTree(node.right, value);
    }
}
