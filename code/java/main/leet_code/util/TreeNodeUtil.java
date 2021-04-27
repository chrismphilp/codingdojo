package leet_code.util;

import leet_code.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class TreeNodeUtil {
    public static void compareTreeNode(TreeNode node1, TreeNode node2) {
        List<Integer> node1Nodes = new ArrayList<>();
        inOrderTraversal(node1Nodes, node1);
        List<Integer> node2Nodes = new ArrayList<>();
        inOrderTraversal(node2Nodes, node2);
        assertEquals(node1Nodes, node2Nodes);
    }

    private static void inOrderTraversal(List<Integer> nodes, TreeNode curr) {
        if (curr != null) {
            nodes.add(curr.val);
            if (curr.left != null) inOrderTraversal(nodes, curr.left);
            if (curr.right != null) inOrderTraversal(nodes, curr.right);
        }
    }
}
