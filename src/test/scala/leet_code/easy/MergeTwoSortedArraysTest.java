package leet_code.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTwoSortedArraysTest {

    private MergeTwoSortedArrays mergeTwoSortedArrays;

    @BeforeEach
    public void setup() {
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void empty_arrays_should_return_empty_array() {
        int[] array1 = new int[]{0};
        int[] array2 = new int[]{0};

        mergeTwoSortedArrays.merge(array1, 0, array2, 0);
        assertArrayEquals(new int[]{0}, array1);
    }

    @Test
    public void empty_arrays_should_return_empty_array_other_way() {
        int[] array1 = new int[]{0};
        int[] array2 = new int[]{1};

        mergeTwoSortedArrays.merge(array1, 0, array2, 1);
        assertArrayEquals(new int[]{1}, array1);
    }

    @Test
    public void sorted_arrays_of_same_length_should_return_sorted_merged_array() {
        int[] arrayA = new int[]{1, 5, 9, 13, 0, 0, 0, 0};
        int[] arrayB = new int[]{2, 6, 10, 14};
        mergeTwoSortedArrays.merge(arrayA, 4, arrayB, arrayB.length);
        assertArrayEquals(new int[]{1, 2, 5, 6, 9, 10, 13, 14}, arrayA);
    }

    @Test
    public void sorted_arrays_of_different_length_should_return_sorted_merged_array() {
        int[] arrayA = new int[]{1, 5, 75, 0, 0, 0, 0};
        int[] arrayB = new int[]{-5, 2, 6, 10};
        mergeTwoSortedArrays.merge(arrayA, 3, arrayB, arrayB.length);
        assertArrayEquals(new int[]{-5, 1, 2, 5, 6, 10, 75}, arrayA);
    }

    @Test
    public void sorted_arrays_of_vastly_different_length_should_return_sorted_merged_array() {
        int[] arrayA = new int[]{1, 0, 0, 0, 0};
        int[] arrayB = new int[]{-5, 2, 6, 10};
        mergeTwoSortedArrays.merge(arrayA, 1, arrayB, arrayB.length);
        assertArrayEquals(new int[]{-5, 1, 2, 6, 10}, arrayA);
    }
}
