package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Continue tests
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
    public void should_return_correct_value_for_double_level_tree() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        assertEquals(3, deepestLeavesSum.deepestLeavesSum(treeNode));
    }
}
