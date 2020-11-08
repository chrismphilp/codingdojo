package leet_code.medium;

import leet_code.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindElementsInAContaminatedBinaryTreeTest {

    @Test
    public void should_return_false_for_null_root() {
        FindElementsInAContaminatedBinaryTree findElements = new FindElementsInAContaminatedBinaryTree(null);
        assertFalse(findElements.find(0));
    }

    @Test
    public void should_return_correct_results_for_find_on_single_value_root() {
        TreeNode root = new TreeNode(-1);
        FindElementsInAContaminatedBinaryTree findElements = new FindElementsInAContaminatedBinaryTree(root);
        assertTrue(findElements.find(0));
        assertFalse(findElements.find(1));
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        TreeNode root = new TreeNode(-1);
        // RHS
        root.right = new TreeNode(-1);

        FindElementsInAContaminatedBinaryTree findElements = new FindElementsInAContaminatedBinaryTree(root);
        assertTrue(findElements.find(2));
        assertFalse(findElements.find(1));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        TreeNode root = new TreeNode(-1);

        // LHS
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-1);
        TreeNode node3 = new TreeNode(-1);
        // RHS
        TreeNode node4 = new TreeNode(-1);

        // LHS
        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        // RHS
        root.right = node4;

        FindElementsInAContaminatedBinaryTree findElements = new FindElementsInAContaminatedBinaryTree(root);
        assertTrue(findElements.find(0));
        assertTrue(findElements.find(1));
        assertTrue(findElements.find(2));
        assertTrue(findElements.find(3));
        assertTrue(findElements.find(4));

        assertFalse(findElements.find(5));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        TreeNode root = new TreeNode(-1);

        // RHS
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-1);
        TreeNode node3 = new TreeNode(-1);

        // RHS
        root.right = node1;
        node1.left = node2;
        node2.left = node3;

        FindElementsInAContaminatedBinaryTree findElements = new FindElementsInAContaminatedBinaryTree(root);
        assertTrue(findElements.find(0));
        assertTrue(findElements.find(2));
        assertTrue(findElements.find(5));
        assertTrue(findElements.find(11));

        assertFalse(findElements.find(1));
        assertFalse(findElements.find(3));
        assertFalse(findElements.find(4));
    }
}