package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsTest {

    private Permutations permutations;

    @Before
    public void setup() {
        permutations = new Permutations();
    }

    @Test
    public void empty_array_should_return_empty_list() {
        assertEquals(0, permutations.permute(new int[]{}).size());
    }

    @Test
    public void single_element_array_should_return_single_item_list() {
        assertEquals(1, permutations.permute(new int[]{1}).size());
    }

    @Test
    public void two_element_array_should_return_correct_permutation_list() {
        assertTrue(permutations.permute(new int[]{1, 2}).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(2, 1)
                )
        ));
    }

    @Test
    public void three_element_array_should_return_correct_permutation_list() {
        assertTrue(permutations.permute(new int[]{1, 2, 3}).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3, 2),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 1, 2)
                )
        ));
    }

    @Test
    public void four_element_array_should_return_correct_permutation_list() {
        assertTrue(permutations.permute(new int[]{1, 2, 3, 4}).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 2, 3, 4),
                        Arrays.asList(1, 2, 4, 3),
                        Arrays.asList(1, 3, 2, 4),
                        Arrays.asList(1, 3, 4, 2),
                        Arrays.asList(1, 4, 2, 3),
                        Arrays.asList(1, 4, 3, 2),
                        Arrays.asList(2, 1, 3, 4),
                        Arrays.asList(2, 1, 4, 3),
                        Arrays.asList(2, 3, 1, 4),
                        Arrays.asList(2, 3, 4, 1),
                        Arrays.asList(2, 4, 1, 3),
                        Arrays.asList(2, 4, 3, 1),
                        Arrays.asList(3, 1, 2, 4),
                        Arrays.asList(3, 1, 4, 2),
                        Arrays.asList(3, 2, 1, 4),
                        Arrays.asList(3, 2, 4, 1),
                        Arrays.asList(3, 4, 1, 2),
                        Arrays.asList(3, 4, 2, 1),
                        Arrays.asList(4, 1, 2, 3),
                        Arrays.asList(4, 1, 3, 2),
                        Arrays.asList(4, 2, 1, 3),
                        Arrays.asList(4, 2, 3, 1),
                        Arrays.asList(4, 3, 1, 2),
                        Arrays.asList(4, 3, 2, 1)
                )
        ));
    }
}
