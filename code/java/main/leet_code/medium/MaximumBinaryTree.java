package leet_code.medium;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        TreeNode root = new TreeNode();
        findNextLevel(root, nums, 0, nums.length - 1);
        return root;
    }

    private void findNextLevel(TreeNode node, int[] nums, int lower, int upper) {
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = lower; i <= upper; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        if (lower >= upper) {
            node.val = nums[Math.max(upper, 0)];
        } else {
            node.val = maxValue;
            if (lower <= maxIndex - 1) {
                node.left = new TreeNode();
                findNextLevel(node.left, nums, lower, maxIndex - 1);
            }
            if (maxIndex + 1 <= upper) {
                node.right = new TreeNode();
                findNextLevel(node.right, nums, maxIndex + 1, upper);
            }
        }
    }
}
