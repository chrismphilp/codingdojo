package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndOfListTest {

    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @Before
    public void setup() {
        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    }

    @Test
    public void should_return_an_empty_list_for_single_element_list() {
        ListNode listNode = new ListNode(1);
        assertNull(removeNthNodeFromEndOfList.removeNthFromEnd(listNode, 1));
    }

    @Test
    public void should_return_a_single_element_list_for_double_element_list() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(3);
        assertEquals(2, removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 1).val);
    }

    @Test
    public void should_remove_last_element_for_multiple_element_list() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 1);
        assertEquals(2, head.val);
        assertEquals(3, head.next.val);
        assertEquals(4, head.next.next.val);
        assertNull(head.next.next.next);
    }

    @Test
    public void should_remove_first_element_for_multiple_element_list() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 4);
        assertEquals(3, head.val);
        assertEquals(4, head.next.val);
        assertEquals(5, head.next.next.val);
        assertNull(head.next.next.next);
    }

    @Test
    public void should_remove_middle_element_for_multiple_element_list() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(listNode1, 2);
        assertEquals(2, head.val);
        assertEquals(3, head.next.val);
        assertEquals(5, head.next.next.val);
        assertNull(head.next.next.next);
    }
}
