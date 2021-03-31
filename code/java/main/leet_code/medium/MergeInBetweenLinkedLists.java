package leet_code.medium;

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int start = 0;
        ListNode begin = list1;
        ListNode end;

        // Find point to start split list
        while (start != a - 1) {
            begin = begin.next;
            start++;
        }

        // Get list1 to be at correct
        end = begin.next;
        while (start != b) {
            end = end.next;
            start++;
        }

        // Set the next node to be start of joined list
        begin.next = list2;

        // Find end of list2
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end;

        return list1;
    }
}
