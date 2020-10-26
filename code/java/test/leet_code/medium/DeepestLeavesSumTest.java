package leet_code.medium;

import leet_code.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeepestLeavesSumTest {

    private DeepestLeavesSum deepestLeavesSum;

    @Before
    public void setup() {
        deepestLeavesSum = new DeepestLeavesSum();
    }

    @Test
    public void single_node_should_return_root_value() {
        TreeNode treeNode = new TreeNode(5);
        assertEquals(5, deepestLeavesSum.deepestLeavesSum(treeNode));
    }

    @Test
    public void should_return_correct_value_for_two_level_tree() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        assertEquals(3, deepestLeavesSum.deepestLeavesSum(treeNode));
    }

    @Test
    public void should_return_correct_value_for_example_tree() {
        TreeNode root = new TreeNode(1);
        TreeNode leftTwoNode = new TreeNode(2);
        TreeNode rightThreeNode = new TreeNode(3);
        root.left = leftTwoNode;
        root.right = rightThreeNode;

        TreeNode leftSevenNode = new TreeNode(4);
        TreeNode leftFiveNode = new TreeNode(5);
        leftTwoNode.left = leftSevenNode;
        leftTwoNode.right = leftFiveNode;
        leftSevenNode.left = new TreeNode(7);

        TreeNode rightSixNode = new TreeNode(6);
        rightThreeNode.right = rightSixNode;
        rightSixNode.right = new TreeNode(8);

        assertEquals(15, deepestLeavesSum.deepestLeavesSum(root));
    }
}
