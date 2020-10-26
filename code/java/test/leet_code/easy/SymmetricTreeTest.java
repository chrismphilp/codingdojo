package leet_code.easy;

import leet_code.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SymmetricTreeTest {

    private SymmetricTree symmetricTree;

    @Before
    public void setup() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    public void should_return_true_for_null_root() {
        assertTrue(symmetricTree.isSymmetric(null));
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        // RHS
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);

        // LHS
        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        // LHS
        root.right = node4;
        node4.left = node5;
        node4.right = node6;

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        // RHS
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);

        // LHS
        root.left = node1;
        node1.right = node2;

        // RHS
        root.right = node3;
        node3.right = node4;

        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void should_return_correct_result_for_example_three() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(2);

        // LHS
        root.left = node1;
        node1.left = node2;
        node1.right = node3;

        assertFalse(symmetricTree.isSymmetric(root));
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

        // LHS
        root.left = node1;
        node1.left = node2;
        node2.left = node3;
        // RHS
        root.right = node4;
        node4.right = node5;
        node5.right = node6;

        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void should_return_correct_result_for_example_five() {
        TreeNode root = new TreeNode(1);
        // LHS
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        // RHS
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3);

        // LHS
        root.left = node1;
        node1.left = node2;
        // RHS
        root.right = node4;
        node4.left = node5;

        assertFalse(symmetricTree.isSymmetric(root));
    }
}
