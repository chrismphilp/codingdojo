package leet_code.medium;

public class LinkedListCycleTwo {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        while (head.next != null) {
            if (head.val == Integer.MAX_VALUE) return head;
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() { }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
