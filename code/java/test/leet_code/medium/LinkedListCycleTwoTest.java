package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleTwoTest {

    private LinkedListCycleTwo linkedListCycleTwo;

    @Before
    public void setup() {
        linkedListCycleTwo = new LinkedListCycleTwo();
    }

    @Test
    public void empty_linked_list_should_return_null() {
        ListNode listNode = new ListNode();
        assertNull(linkedListCycleTwo.detectCycle(listNode));
    }

    @Test
    public void single_element_in_linked_list_should_return_null() {
        ListNode listNode = new ListNode(5);
        assertNull(linkedListCycleTwo.detectCycle(listNode));
    }

    @Test
    public void two_item_cyclic_list_should_return_node_one() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeOne;
        assertEquals(listNodeOne, linkedListCycleTwo.detectCycle(listNodeOne));
    }

    @Test
    public void four_item_cyclic_list_should_return_node_two() {
        ListNode listNodeOne = new ListNode(3);
        ListNode listNodeTwo = new ListNode(2);
        ListNode listNodeThree = new ListNode(0);
        ListNode listNodeFour = new ListNode(-4);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeThree;
        listNodeThree.next = listNodeFour;
        listNodeFour.next = listNodeTwo;
        assertEquals(listNodeTwo, linkedListCycleTwo.detectCycle(listNodeOne));
    }

    @Test
    public void two_item_non_cyclic_list_should_return_null() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = null;
        assertNull(linkedListCycleTwo.detectCycle(listNodeOne));
    }
}
