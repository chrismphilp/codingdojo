package leet_code.medium;

import leet_code.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        LinkedList<TreeNode> fifo = new LinkedList<>();
        Map<TreeNode, Integer> nodeDistance = new HashMap<>();

        fifo.add(root);
        nodeDistance.put(root, 1);

        int maxWidth = 1;

        while (!fifo.isEmpty()) {
            int size = fifo.size();
            int start = 0;
            int end = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = fifo.pop();
                if (i == 0) start = nodeDistance.get(curr);
                if (i == size - 1) end = nodeDistance.get(curr);
                if (curr.left != null) {
                    nodeDistance.put(curr.left, nodeDistance.get(curr) * 2);
                    fifo.add(curr.left);
                }
                if (curr.right != null) {
                    nodeDistance.put(curr.right, nodeDistance.get(curr) * 2 + 1);
                    fifo.add(curr.right);
                }
            }
            maxWidth = Math.max(maxWidth, end - start + 1);
        }
        return maxWidth;
    }
}
