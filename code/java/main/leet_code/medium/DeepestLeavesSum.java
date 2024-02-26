package leet_code.medium;

import leet_code.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        int sum = root.val, i;

        while (!treeNodeQueue.isEmpty()) {
            Queue<TreeNode> tmp = new LinkedList<>();

            for (i = treeNodeQueue.size() - 1, sum = 0; i >= 0; i--) {
                TreeNode curr = treeNodeQueue.poll();
                sum += curr.val;
                if (curr.left != null) tmp.add(curr.left);
                if (curr.right != null) tmp.add(curr.right);
            }
            treeNodeQueue.addAll(tmp);
        }
        return sum;
    }
}


