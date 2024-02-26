package leet_code.medium;

import leet_code.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inOrderTraversal(root, nodes);
        return createBinaryTree(nodes, 0, nodes.size() - 1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> nodes) {
        if (node != null) {
            inOrderTraversal(node.left, nodes);
            nodes.add(node.val);
            inOrderTraversal(node.right, nodes);
        }
    }

    private TreeNode createBinaryTree(List<Integer> nodes, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode curr = new TreeNode(nodes.get(mid));
        curr.left = createBinaryTree(nodes, start, mid);
        curr.right = createBinaryTree(nodes, mid, end);
        return curr;
    }
}
