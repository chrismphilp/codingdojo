package leet_code.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class PermutationsIITest {

    @InjectMocks
    private PermutationsII permutationsII;

    @Test
    public void should_return_correct_result_for_example_one() {
        List<List<Integer>> res = permutationsII.permuteUnique(new int[]{1, 1, 2});
        assertThat(res.size()).isEqualTo(3);
        assertThat(permutationsII.permuteUnique(new int[]{1, 2}).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 1, 2),
                        Arrays.asList(1, 2, 1),
                        Arrays.asList(2, 1, 1)
                )
        ));
    }

    @Test
    public void should_return_correct_result_for_example_two() {
        List<List<Integer>> res = permutationsII.permuteUnique(new int[]{1, 2, 3});
        assertThat(res.size()).isEqualTo(6);
        assertThat(permutationsII.permuteUnique(new int[]{1, 2}).containsAll(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3, 2),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 2, 1)
                )
        ));
    }
}