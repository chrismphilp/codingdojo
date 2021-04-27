package leet_code.medium;

import leet_code.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

// TODO: Finish
@ExtendWith(MockitoExtension.class)
class AllPossibleFullBinaryTreesTest {

    @InjectMocks
    private AllPossibleFullBinaryTrees allPossibleFullBinaryTrees;

    @Test
    public void should_return_correct_result_for_example_one() {

    }

    @Test
    public void should_return_correct_result_for_example_two() {
        List<TreeNode> treeNodes = allPossibleFullBinaryTrees.allPossibleFBT(3);
    }
}