package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextPermutationTest {

    private NextPermutation nextPermutation;

    @Before
    public void setup() {
        nextPermutation = new NextPermutation();
    }

    @Test
    public void single_digit_input_should_return_same_array() {
        int[] input = new int[]{0};
        nextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{0}, input);
    }

    @Test
    public void descending_sorted_array_should_swap_last_two_digits() {
        int[] input = new int[]{3, 2, 1};
        nextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{1, 2, 3}, input);
    }

    @Test
    public void ascending_sorted_array_should_swap_last_two_digits() {
        int[] input = new int[]{1, 2, 3};
        nextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{1, 3, 2}, input);
    }

    @Test
    public void array_with_multiple_identical_digits_should_return_correct_result() {
        int[] input1 = new int[]{4, 5, 5, 6, 4, 3, 2};
        nextPermutation.nextPermutation(input1);
        assertArrayEquals(new int[]{4, 5, 6, 2, 3, 4, 5}, input1);

        int[] input2 = new int[]{2, 2, 7, 5, 4, 3, 2, 2, 1};
        nextPermutation.nextPermutation(input2);
        assertArrayEquals(new int[]{2, 3, 1, 2, 2, 2, 4, 5, 7}, input2);

        int[] input3 = new int[]{1, 7, 8, 5, 7, 4, 1, 8, 5, 9, 7, 5};
        nextPermutation.nextPermutation(input3);
        assertArrayEquals(new int[]{1, 7, 8, 5, 7, 4, 1, 8, 7, 5, 5, 9}, input3);
    }
}
