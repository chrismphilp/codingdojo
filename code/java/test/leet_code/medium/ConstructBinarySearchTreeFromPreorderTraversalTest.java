package leet_code.medium;

import leet_code.util.TreeNode;
import leet_code.util.TreeNodeUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ConstructBinarySearchTreeFromPreorderTraversalTest {

    @InjectMocks
    ConstructBinarySearchTreeFromPreorderTraversal testedClass;

    @Test
    public void should_return_correct_tree_for_example_one() {
        int[] input = new int[]{8, 5, 1, 7, 10, 12};

        TreeNode root = new TreeNode(8);
        // Left
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(7);
        root.left = node1;
        node1.left = node2;
        node1.right = node3;
        // Right
        TreeNode node4 = new TreeNode(10);
        TreeNode node5 = new TreeNode(12);
        root.right = node4;
        node4.right = node5;

        TreeNode result = testedClass.bstFromPreorder(input);
        TreeNodeUtil.compareTreeNode(root, result);
    }

    @Test
    public void should_return_correct_tree_for_example_two() {
        int[] input = new int[]{1, 3};

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode result = testedClass.bstFromPreorder(input);
        TreeNodeUtil.compareTreeNode(root, result);
    }

    @Test
    public void should_return_correct_tree_for_left_sided_tree() {
        int[] input = new int[]{4, 3, 2, 1};

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(1);

        root.left = node1;
        node1.left = node2;
        node2.left = node3;

        TreeNode result = testedClass.bstFromPreorder(input);
        TreeNodeUtil.compareTreeNode(root, result);
    }
}