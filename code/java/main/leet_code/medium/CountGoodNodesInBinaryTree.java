package leet_code.medium;

import leet_code.util.TreeNode;

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return findGoodNodes(root, root.val);
    }

    private int findGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null) return 0;
        int max = Math.max(maxSoFar, node.val);
        if (node.val >= maxSoFar) return 1 + findGoodNodes(node.left, max) + findGoodNodes(node.right, max);
        else return findGoodNodes(node.left, max) + findGoodNodes(node.right, max);
    }
}
