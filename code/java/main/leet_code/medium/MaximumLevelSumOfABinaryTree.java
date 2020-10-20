package leet_code.medium;

import java.util.HashMap;
import java.util.Map;

// TODO: Improve speed
public class MaximumLevelSumOfABinaryTree {

    Map<Integer, Integer> levelStore = new HashMap<>();

    public int maxLevelSum(TreeNode root) {
        calculateLevelValues(root, 1);
        int maxLevel = 1;
        int valueAtMax = root.val;

        for (Map.Entry<Integer, Integer> entry : levelStore.entrySet()) {
            if (entry.getValue() > valueAtMax) {
                maxLevel = entry.getKey();
                valueAtMax = entry.getValue();
            }
        }
        return maxLevel;
    }

    private void calculateLevelValues(TreeNode node, int level) {
        if (node != null) {
            levelStore.compute(level, (k, v) -> (v == null) ? node.val : v + node.val);
            calculateLevelValues(node.left, level + 1);
            calculateLevelValues(node.right, level + 1);
        }
    }
}
