package leet_code.easy;

import leet_code.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnivaluedBinaryTreeTest {

    private UnivaluedBinaryTree univaluedBinaryTree;

    @Before
    public void setup() {
        univaluedBinaryTree = new UnivaluedBinaryTree();
    }

    @Test
    public void should_return_true_for_null_root() {
        assertTrue(univaluedBinaryTree.isUnivalTree(null));
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        // RHS
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(2);

        // LHS
        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        // LHS
        root.right = node4;
        node4.left = node5;
        node4.right = node6;

        assertFalse(univaluedBinaryTree.isUnivalTree(root));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(5);
        // RHS
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(5);

        // LHS
        root.left = node1;
        node1.right = node2;

        // RHS
        root.right = node3;
        node3.right = node4;

        assertFalse(univaluedBinaryTree.isUnivalTree(root));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);

        // LHS
        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        assertTrue(univaluedBinaryTree.isUnivalTree(root));
    }
}
