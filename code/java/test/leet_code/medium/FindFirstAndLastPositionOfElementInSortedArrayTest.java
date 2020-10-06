package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElement;

    @Before
    public void setup() {
        findFirstAndLastPositionOfElement = new FindFirstAndLastPositionOfElementInSortedArray();
    }

    @Test
    public void should_return_an_invalid_array_if_the_length_is_less_than_one() {
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElement.searchRange(new int[]{}, 5));
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElement.searchRange(new int[]{1}, 5));
    }

    @Test
    public void should_return_end_indexes_of_array_duplication_of_array() {
        assertArrayEquals(new int[]{0, 1}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 1}, 1));
        assertArrayEquals(new int[]{0, 6}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 1, 1, 1, 1, 1, 1}, 1));
    }

    @Test
    public void should_return_correct_same_index_of_only_single_elements() {
        assertArrayEquals(new int[]{0, 0}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 2, 3, 4, 5, 6}, 1));
        assertArrayEquals(new int[]{0, 0}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 2}, 1));
    }

    @Test
    public void should_return_correct_indexes_of_duplicated_elements() {
        assertArrayEquals(new int[]{5, 7}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 2, 2, 3, 3, 5, 5, 5}, 5));
        assertArrayEquals(new int[]{0, 3}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 1, 1, 1, 2, 2, 2}, 1));
    }

    @Test
    public void should_return_invalid_array_if_target_does_not_exist() {
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 2, 2, 3, 3, 5, 5, 5}, 10));
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElement.searchRange(new int[]{1, 2, 2, 3, 3}, 0));
    }
}
