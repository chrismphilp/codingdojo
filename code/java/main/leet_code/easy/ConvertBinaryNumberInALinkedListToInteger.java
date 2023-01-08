package leet_code.easy;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        if (head != null) {
            return head.val + getDecimalValue(head.next) * 2;
        }
        return 0;
    }
}
