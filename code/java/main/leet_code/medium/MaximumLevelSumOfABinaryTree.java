package leet_code.medium;

import java.util.LinkedList;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        LinkedList<TreeNode> fifo = new LinkedList<>();
        fifo.add(root);

        int level = 1, maxLevel = 1;
        int valueAtMax = root.val;

        while (!fifo.isEmpty()) {
            int levelSum = 0;
            int fifoSize = fifo.size();

            for (int i = 0; i < fifoSize; i++) {
                TreeNode curr = fifo.pop();
                levelSum += curr.val;
                if (curr.left != null) fifo.add(curr.left);
                if (curr.right != null) fifo.add(curr.right);
            }
            if (levelSum > valueAtMax) {
                maxLevel = level;
                valueAtMax = levelSum;
            }
            level++;
        }
        return maxLevel;
    }
}
