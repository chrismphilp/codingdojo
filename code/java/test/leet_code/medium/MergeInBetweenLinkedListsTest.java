package leet_code.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class MergeInBetweenLinkedListsTest {

    @InjectMocks
    private MergeInBetweenLinkedLists mergeInBetweenLinkedLists;

    @Test
    public void should_return_correct_result_for_example_one() {
        ListNode list1 = linkedListCreator(new int[]{0, 1, 2, 3, 4, 5});
        ListNode list2 = linkedListCreator(new int[]{1000000, 1000001, 1000002});
        int a = 3;
        int b = 4;

        ListNode res = mergeInBetweenLinkedLists.mergeInBetween(list1, a, b, list2);
        assertThat(matchLinkedListValues(res, new int[]{0, 1, 2, 1000000, 1000001, 1000002, 5})).isTrue();
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        ListNode list1 = linkedListCreator(new int[]{0, 1, 2, 3, 4, 5, 6});
        ListNode list2 = linkedListCreator(new int[]{1000000, 1000001, 1000002, 1000003, 1000004});
        int a = 2;
        int b = 5;

        ListNode res = mergeInBetweenLinkedLists.mergeInBetween(list1, a, b, list2);
        assertThat(matchLinkedListValues(res, new int[]{0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6})).isTrue();
    }

    private ListNode linkedListCreator(int[] nums) {
        ListNode listNode = new ListNode(nums[0]);
        ListNode tmp = listNode;

        for (int i = 1; i < nums.length; i++) {
            tmp.next = new ListNode(nums[i]);
            tmp = tmp.next;
        }
        return listNode;
    }

    private boolean matchLinkedListValues(ListNode node, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (node.val != nums[i]) return false;
            node = node.next;
        }
        return node == null;
    }
}