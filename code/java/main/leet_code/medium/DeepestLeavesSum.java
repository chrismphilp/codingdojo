package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeepestLeavesSum {
    private final Map<Integer, List<Integer>> mapOfLevels = new HashMap<>();
    int maxLevel = 1;

    public int deepestLeavesSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        else bfs(root, 1);
        return mapOfLevels.get(maxLevel).stream().mapToInt(Integer::intValue).sum();
    }

    public void bfs(TreeNode node, int currentLevel) {
        if (mapOfLevels.containsKey(currentLevel)) {
            List<Integer> currentLevelArray = mapOfLevels.get(currentLevel);
            currentLevelArray.add(node.val);
            mapOfLevels.put(currentLevel, currentLevelArray);
        } else {
            mapOfLevels.put(currentLevel, new ArrayList<>() {{
                add(node.val);
            }});
        }
        if (maxLevel < currentLevel) maxLevel = currentLevel;
        if (node.left != null) bfs(node.left, currentLevel + 1);
        if (node.right != null) bfs(node.right, currentLevel + 1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
