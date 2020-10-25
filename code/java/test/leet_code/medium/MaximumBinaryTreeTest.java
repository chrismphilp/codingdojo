package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MaximumBinaryTreeTest {

    private MaximumBinaryTree maximumBinaryTree;

    @Before
    public void setup() {
        maximumBinaryTree = new MaximumBinaryTree();
    }

    @Test
    public void should_return_single_root_for_single_element_array() {
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{5});
        assertEquals(5, root.val);
        // LHS
        assertNull(root.left);
        // RHS
        assertNull(root.right);
    }

    @Test
    public void should_return_correct_tree_for_evenly_split_array() {
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{1, 3, 2});
        assertEquals(3, root.val);
        // LHS
        assertEquals(1, root.left.val);
        assertNull(root.left.left);
        assertNull(root.left.right);
        // RHS
        assertEquals(2, root.right.val);
        assertNull(root.right.left);
        assertNull(root.right.right);
    }

    @Test
    public void should_return_correct_tree_for_problem_example() {
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        assertEquals(6, root.val);
        // LHS
        assertEquals(3, root.left.val);
        assertNull(root.left.left);
        assertEquals(2, root.left.right.val);
        assertNull(root.left.right.left);
        assertEquals(1, root.left.right.right.val);
        assertNull(root.left.right.right.left);
        assertNull(root.left.right.right.right);
        // RHS
        assertEquals(5, root.right.val);
        assertNull(root.right.right);
        assertEquals(0, root.right.left.val);
        assertNull(root.right.left.left);
        assertNull(root.right.left.right);
    }

    @Test
    public void should_return_correct_tree_for_lopsided_array() {
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{1, 2, 3, 4, 5});
        assertEquals(5, root.val);
        // LHS
        assertEquals(4, root.left.val);
        assertNull(root.left.right);
        assertEquals(3, root.left.left.val);
        assertNull(root.left.left.right);
        assertEquals(2, root.left.left.left.val);
        assertNull(root.left.left.left.right);
        assertEquals(1, root.left.left.left.left.val);
        assertNull(root.left.left.left.left.left);
        assertNull(root.left.left.left.left.right);
        // RHS
        assertNull(root.right);
    }
}
