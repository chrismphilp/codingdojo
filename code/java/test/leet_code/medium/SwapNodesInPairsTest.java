package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapNodesInPairsTest {

    private SwapNodesInPairs swapNodesInPairs;

    @Before
    public void setup() {
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @Test
    public void empty_linked_list_should_return_empty_list() {
        ListNode listNode = new ListNode();
        assertEquals(0, swapNodesInPairs.swapPairs(listNode).val);
    }

    @Test
    public void single_element_in_linked_list_should_return_same_list() {
        ListNode listNode = new ListNode(1);
        assertEquals(1, swapNodesInPairs.swapPairs(listNode).val);
    }

    @Test
    public void two_item_list_should_return_swapped_nodes() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        listNodeOne.next = listNodeTwo;

        ListNode head = swapNodesInPairs.swapPairs(listNodeOne);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
    }

    @Test
    public void four_item_list_should_return_all_swapped_nodes() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        ListNode listNodeThree = new ListNode(3);
        ListNode listNodeFour = new ListNode(4);
        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeThree;
        listNodeThree.next = listNodeFour;

        ListNode head = swapNodesInPairs.swapPairs(listNodeOne);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
    }

    @Test
    public void three_item_cyclic_list_should_return_first_two_elements_swapped() {
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);
        ListNode listNodeThree = new ListNode(3);

        listNodeOne.next = listNodeTwo;
        listNodeTwo.next = listNodeThree;

        ListNode head = swapNodesInPairs.swapPairs(listNodeOne);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(3, head.next.next.val);
    }
}
