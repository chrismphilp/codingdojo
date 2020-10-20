package leet_code.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// TODO: Improve speed
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int currentLevel = 1;
        int currentlyRead = 0;
        int currentTotal = 0;
        int totalAtMax = root.val;
        int max = 1;
        boolean foundNonNull = false;

        Map<Integer, Integer> levelStore = new HashMap<Integer, Integer>() {{
            put(1, 1);
        }};

        LinkedList<TreeNode> fifo = new LinkedList<>();
        fifo.push(root);

        while (fifo.size() > 0) {
            TreeNode curr = fifo.pop();
            currentlyRead++;

            if (curr != null) {
                foundNonNull = true;

                TreeNode left = curr.left;
                TreeNode right = curr.right;
                int nodesAdded = 0;

                if (left != null) {
                    fifo.add(curr.left);
                    nodesAdded++;
                }
                if (right != null) {
                    fifo.add(curr.right);
                    nodesAdded++;
                }
                currentTotal += curr.val;
                int finalNodesAdded = nodesAdded;
                levelStore.compute(currentLevel + 1, (k, v) -> (v == null) ? finalNodesAdded : v + finalNodesAdded);
            }

            if (currentlyRead == levelStore.get(currentLevel)) {
                if (currentTotal > totalAtMax && foundNonNull) {
                    max = currentLevel;
                    totalAtMax = currentTotal;
                }
                currentLevel++;
                currentlyRead = 0;
                currentTotal = 0;
                foundNonNull = false;
            }
        }
        return max;
    }
}
