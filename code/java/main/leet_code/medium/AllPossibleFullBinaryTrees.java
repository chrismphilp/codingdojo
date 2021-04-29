package leet_code.medium;

import leet_code.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: Finish
public class AllPossibleFullBinaryTrees {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> nodes = new ArrayList<>();

        if (n % 2 != 0) {
            List<List<Integer>> traversal = new ArrayList<>();
            List<Integer> values = new ArrayList<Integer>() {{
                add(0);
            }};
            createInOrderTraversal(traversal, values, n - 1);
            for (List<Integer> v : traversal) {
                nodes.add(createTreeFromInOrderTraversal(v));
            }
        }
        return nodes;
    }

    private void createInOrderTraversal(List<List<Integer>> traversal, List<Integer> values, int n) {
        if (n > 2) {
            List<Integer> right = new ArrayList<>(values);
            right.add(null);
            right.add(0);
            createInOrderTraversal(traversal, right, n - 2);

            List<Integer> left = new ArrayList<>(values);
            left.add(0);
            left.add(null);
            createInOrderTraversal(traversal, left, n - 2);
        } else if (n == 2) {
            values.add(null);
            values.add(null);
            traversal.add(values);
        }
    }

    private TreeNode createTreeFromInOrderTraversal(List<Integer> values) {
        return null;
    }
}
