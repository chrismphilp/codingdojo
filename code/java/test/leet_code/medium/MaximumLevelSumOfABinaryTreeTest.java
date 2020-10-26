package leet_code.medium;

import leet_code.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLevelSumOfABinaryTreeTest {

    private MaximumLevelSumOfABinaryTree maximumLevelSumOfABinaryTree;

    @Before
    public void setup() {
        maximumLevelSumOfABinaryTree = new MaximumLevelSumOfABinaryTree();
    }

    @Test
    public void should_return_one_for_only_root_node() {
        TreeNode root = new TreeNode(5);
        assertEquals(1, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_root_node_for_all_equal_level_tree() {
        TreeNode root = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(5);

        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;

        assertEquals(1, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_level_for_balanced_tree() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.right = treeNode3;

        // RHS
        root.right = treeNode4;
        treeNode4.left = treeNode5;

        assertEquals(3, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_value_for_misweighted_tree() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        // RHS
        root.right = treeNode4;

        assertEquals(2, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_value_for_single_sided_tree() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;
        treeNode3.left = treeNode4;

        assertEquals(5, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_value_for_large_root_value() {
        TreeNode root = new TreeNode(25);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(2);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.right = treeNode3;

        // RHS
        root.right = treeNode4;

        assertEquals(1, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_value_for_tree_with_negative_values() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(-8);
        TreeNode treeNode4 = new TreeNode(0);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        // RHS
        root.right = treeNode4;

        assertEquals(2, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }

    @Test
    public void should_return_correct_value_for_tree_with_all_negative_values() {
        TreeNode root = new TreeNode(-100);
        TreeNode treeNode1 = new TreeNode(-200);
        TreeNode treeNode2 = new TreeNode(-20);
        TreeNode treeNode3 = new TreeNode(-5);
        TreeNode treeNode4 = new TreeNode(-300);
        TreeNode treeNode5 = new TreeNode(-10);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        // RHS
        root.right = treeNode4;
        treeNode4.left = treeNode5;

        assertEquals(3, maximumLevelSumOfABinaryTree.maxLevelSum(root));
    }
}
