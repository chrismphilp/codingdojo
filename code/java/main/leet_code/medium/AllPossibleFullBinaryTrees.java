package leet_code.medium;

import leet_code.TreeNode;

import java.util.ArrayList;
import java.util.List;

// TODO: Finish
public class AllPossibleFullBinaryTrees {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> nodes = new ArrayList<>();

        if (n % 2 != 0) {
            List<List<Integer>> traversal = new ArrayList<>();
            createInOrderTraversal(traversal, new ArrayList<>(), n);
            for (List<Integer> v : traversal) {
                nodes.add(createTreeFromInOrderTraversal(v));
            }
        }
        return nodes;
    }

    private void createInOrderTraversal(List<List<Integer>> traversal, List<Integer> values, int n) {
        if (n > 0) {
            List<Integer> left = new ArrayList<>(values);
            List<Integer> right = new ArrayList<>(values);

            createInOrderTraversal(traversal, left, n - 2);
            createInOrderTraversal(traversal, right, n - 2);
        } else {
            traversal.add(null);
            traversal.add(null);
            traversal.add(values);
        }
    }

    private TreeNode createTreeFromInOrderTraversal(List<Integer> values) {
        return null;
    }
}
