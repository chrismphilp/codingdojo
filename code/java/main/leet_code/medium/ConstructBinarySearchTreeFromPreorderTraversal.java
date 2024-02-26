package leet_code.medium;

import leet_code.util.TreeNode;

// TODO: Understand how this works
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode treeNode = new TreeNode();
        goDownTree(treeNode, preorder, 0, preorder.length - 1);
        return treeNode;
    }

    private void goDownTree(TreeNode curr, int[] preorder, int start, int end) {

        if (start <= end) {
            curr.val = preorder[start];

            int tmp = start + 1;
            while (tmp <= end && preorder[tmp] < curr.val) {
                tmp++;
            }

            if (start + 1 <= tmp - 1) {
                curr.left = new TreeNode();
                goDownTree(curr.left, preorder, start + 1, tmp - 1);
            }
            if (tmp <= end) {
                curr.right = new TreeNode();
                goDownTree(curr.right, preorder, tmp, end);
            }
        }
    }
}
