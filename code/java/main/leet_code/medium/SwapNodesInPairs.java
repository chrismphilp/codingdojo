package leet_code.medium;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = head;

        while (node != null && node.next != null) {
            swapNodeValues(node, node.next);
            node = node.next.next;
        }
        return head;
    }

    private void swapNodeValues(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}
