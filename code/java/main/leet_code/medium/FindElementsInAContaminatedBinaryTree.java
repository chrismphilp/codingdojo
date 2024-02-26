package leet_code.medium;

import leet_code.util.TreeNode;

import java.util.HashSet;

public class FindElementsInAContaminatedBinaryTree {

    HashSet<Integer> numbers = new HashSet<>();

    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
        recoverBinaryTree(root, Direction.RIGHT, -1);
    }

    private void recoverBinaryTree(TreeNode node, Direction direction, int previousValue) {
        if (node != null) {
            int val = 0;
            switch (direction) {
                case LEFT:
                    val = 2 * previousValue + 1;
                    break;
                case RIGHT:
                    val = 2 * previousValue + 2;
                    break;
            }
            numbers.add(val);
            recoverBinaryTree(node.left, Direction.LEFT, val);
            recoverBinaryTree(node.right, Direction.RIGHT, val);
        }
    }

    public boolean find(int target) {
        return numbers.contains(target);
    }

    enum Direction {
        LEFT,
        RIGHT
    }
}
