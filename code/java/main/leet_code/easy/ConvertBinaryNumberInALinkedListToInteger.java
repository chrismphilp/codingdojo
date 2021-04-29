package leet_code.easy;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        int total = 0;
        while (head != null) {
            size--;
            if (head.val == 1) {
                total += Math.pow(2, size);
            }
            head = head.next;
        }
        return total;
    }
}
