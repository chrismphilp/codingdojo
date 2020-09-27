package leet_code.medium;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) return null;

        int tmpCount = 0;
        int totalCount = 0;
        ListNode tmpHead = head;
        ListNode prev = tmpHead;

        while (tmpHead.next != null) {
            if (tmpCount == n) {
                prev = prev.next;
            } else tmpCount++;
            totalCount++;
            tmpHead = tmpHead.next;
        }

        if (totalCount == n - 1) return head.next;
        else if (prev.next.next == null) prev.next = null;
        else prev.next = prev.next.next;

        return head;
    }
}
