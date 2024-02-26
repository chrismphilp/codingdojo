package leet_code.medium;

import leet_code.util.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Finish
@ExtendWith(MockitoExtension.class)
class AllPossibleFullBinaryTreesTest {

    @InjectMocks
    private AllPossibleFullBinaryTrees allPossibleFullBinaryTrees;

    @Test
    public void should_return_empty_list_for_even_numbers() {
        assertEquals(0, allPossibleFullBinaryTrees.allPossibleFBT(6).size());
        assertEquals(0, allPossibleFullBinaryTrees.allPossibleFBT(10).size());
        assertEquals(0, allPossibleFullBinaryTrees.allPossibleFBT(20).size());
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        List<TreeNode> treeNodes = allPossibleFullBinaryTrees.allPossibleFBT(7);
//        assertEquals(5, treeNodes.size());
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        List<TreeNode> treeNodes = allPossibleFullBinaryTrees.allPossibleFBT(3);
        assertEquals(1, treeNodes.size());
    }
}