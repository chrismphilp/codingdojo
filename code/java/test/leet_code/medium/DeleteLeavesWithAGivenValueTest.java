package leet_code.medium;

import leet_code.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeleteLeavesWithAGivenValueTest {

    private DeleteLeavesWithAGivenValue deleteLeavesWithAGivenValue;

    @Before
    public void setup() {
        deleteLeavesWithAGivenValue = new DeleteLeavesWithAGivenValue();
    }

    @Test
    public void should_not_remove_root_node_even_if_it_is_the_target() {
        TreeNode root = new TreeNode(5);
        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 5);
        assertNull(result);
    }

    @Test
    public void tree_containing_only_target_value_should_be_removed() {
        TreeNode root = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(5);

        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 5);
        assertNull(result);
    }

    @Test
    public void should_return_correct_tree_for_multiple_standalone_leaves() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;

        // RHS
        root.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertEquals(3, result.right.val);
        assertEquals(4, result.right.right.val);
    }

    @Test
    public void should_return_correct_tree_for_non_standalone_target_nodes() {
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

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 3);
        assertEquals(1, result.val);
        assertNull(result.right);
        assertEquals(3, result.left.val);
        assertNull(result.left.left);
        assertEquals(2, result.left.right.val);
    }

    @Test
    public void should_return_correct_tree_for_single_sided_tree() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);

        // LHS
        root.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);
        assertEquals(1, result.val);
        assertNull(result.right);
        assertNull(result.left);
    }

    @Test
    public void should_return_correct_tree_for_lopsided_depth_tree() {
        TreeNode root = new TreeNode(2);
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

        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, 2);
        assertEquals(2, result.val);
        assertEquals(5, result.left.val);
        assertEquals(7, result.left.left.val);
        assertNull(result.right);
    }
}
