package leet_code.medium;

import leet_code.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    private MaximumWidthOfBinaryTree maximumWidthOfBinaryTree;

    @Before
    public void setup() {
        maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        // RHS
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(9);

        root.left = node1;
        // LHS
        node1.left = node2;
        node1.right = node3;
        // RHS
        root.right = node4;
        node4.right = node5;

        assertEquals(4, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);

        root.left = node1;
        // LHS
        node1.left = node2;
        node1.right = node3;

        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(2);

        root.left = node1;
        // LHS
        node1.left = node2;
        node1.right = node3;

        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }

    @Test
    public void should_return_correct_result_for_example_four() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(6);
        // RHS
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        // LHS
        node1.left = node2;
        node2.left = node3;
        // RHS
        root.right = node4;
        node4.right = node5;
        node5.right = node6;

        assertEquals(8, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
    }
}
