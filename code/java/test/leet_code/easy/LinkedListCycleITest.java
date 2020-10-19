package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleITest {

    private LinkedListCycleI linkedListCycle;

    @Before
    public void setup() {
        linkedListCycle = new LinkedListCycleI();
    }

    @Test
    public void empty_linked_list_should_return_false() {
        ListNode listNode = new ListNode();
        assertFalse(linkedListCycle.hasCycle(listNode));
    }

    @Test
    public void single_element_in_linked_list_should_return_false() {
        ListNode listNode = new ListNode(5);
        assertFalse(linkedListCycle.hasCycle(listNode));
    }

    @Test
    public void two_item_cyclic_list_should_return_true() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeOne;
        assertTrue(linkedListCycle.hasCycle(listNodeOne));
    }

    @Test
    public void four_item_cyclic_list_should_return_true() {
        ListNode listNodeOne = new ListNode(3);
        ListNode listNodeTwo = new ListNode(2);
        ListNode listNodeThree = new ListNode(0);
        ListNode listNodeFour = new ListNode(-4);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeThree;
        listNodeThree.next = listNodeFour;
        listNodeFour.next = listNodeTwo;
        assertTrue(linkedListCycle.hasCycle(listNodeOne));
    }

    @Test
    public void two_item_non_cyclic_list_should_return_false() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = null;
        assertFalse(linkedListCycle.hasCycle(listNodeOne));
    }
}
