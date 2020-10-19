package leet_code.easy;

public class LinkedListCycleI {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        while (head.next != null) {
            if (head.val == Integer.MAX_VALUE) return true;
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int x) {
        val = x;
        next = null;
    }
}