package leet_code.easy;

import leet_code.medium.TreeNode;

import java.util.LinkedList;

// TODO: Improve speed
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null) return false;
        if (root.right == null) return false;

        LinkedList<TreeNode> left = new LinkedList<>();
        LinkedList<TreeNode> right = new LinkedList<>();
        left.add(root.left);
        right.add(root.right);

        while (!left.isEmpty()) {
            int size = left.size();
            if (size != right.size()) return false;

            for (int i = 0; i < size; i++) {
                TreeNode currLeft = left.pop();
                TreeNode currRight = right.pop();

                if (currLeft != null && currRight != null && currLeft.val != currRight.val) return false;
                else {
                    if (currLeft == null && currRight != null) return false;
                    if (currRight == null && currLeft != null) return false;

                    if (currLeft != null) {
                        left.add(currLeft.left);
                        left.add(currLeft.right);
                    }

                    if (currRight != null) {
                        right.add(currRight.right);
                        right.add(currRight.left);
                    }
                }
            }
        }
        return true;
    }
}
