package leet_code.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import leet_code.util.TreeNode;
import org.junit.Before;
import org.junit.jupiter.api.Test;

// TODO: Finish
class AllPossibleFullBinaryTreesTest {

    private AllPossibleFullBinaryTrees underTest;

    @Before
    public void setup() {
        underTest = new AllPossibleFullBinaryTrees();
    }

    @Test
    public void should_return_empty_list_for_even_numbers() {
        assertEquals(0, underTest.allPossibleFBT(6).size());
        assertEquals(0, underTest.allPossibleFBT(10).size());
        assertEquals(0, underTest.allPossibleFBT(20).size());
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        List<TreeNode> treeNodes = underTest.allPossibleFBT(7);
//        assertEquals(5, treeNodes.size());
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        List<TreeNode> treeNodes = underTest.allPossibleFBT(3);
        assertEquals(1, treeNodes.size());
    }
}