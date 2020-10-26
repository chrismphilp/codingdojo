package leet_code.medium;

import leet_code.TreeNode;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        return shouldRemoveNode(root, target) ? null : root;
    }

    public boolean shouldRemoveNode(TreeNode node, int target) {
        if (node == null) return true;

        TreeNode left = node.left;
        TreeNode right = node.right;

        boolean srl = shouldRemoveNode(left, target);
        boolean srr = shouldRemoveNode(right, target);

        if (srl) node.left = null;
        if (srr) node.right = null;

        if (srl && srr) return node.val == target;
        else return false;
    }
}
