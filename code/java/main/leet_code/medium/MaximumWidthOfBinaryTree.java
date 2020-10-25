package leet_code.medium;

import java.util.LinkedList;

// TODO: Improve speed
public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<TreeNode> fifo = new LinkedList<>();
        fifo.add(root);
        int maxWidth = 1;

        while (!fifo.isEmpty()) {
            int size = fifo.size();
            int currLevelWidth = 1;
            int nodeCount = 0;
            boolean started = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = fifo.pop();
                if (curr != null) {
                    if (started) {
                        currLevelWidth += nodeCount;
                        nodeCount = 0;
                    }
                    started = true;
                    fifo.add(curr.left);
                    fifo.add(curr.right);
                }  else {
                    fifo.add(null);
                    fifo.add(null);
                }
                if (started) {
                    nodeCount++;
                }
            }
            if (!started) break;
            if (currLevelWidth > maxWidth) maxWidth = currLevelWidth;
        }
        return maxWidth;
    }
}
