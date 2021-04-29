package leet_code.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConvertBinaryNumberInALinkedListToIntegerTest {

    @InjectMocks
    private ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger;

    @Test
    public void should_return_correct_result_for_example_one() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);

        node.next = node1;
        node1.next = node2;
        assertEquals(5, convertBinaryNumberInALinkedListToInteger.getDecimalValue(node));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        ListNode node = new ListNode();
        assertEquals(0, convertBinaryNumberInALinkedListToInteger.getDecimalValue(node));
    }
}