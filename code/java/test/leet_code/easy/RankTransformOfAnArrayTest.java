package leet_code.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class RankTransformOfAnArrayTest {

    private RankTransformOfAnArray underTest;

    @Before
    public void setup() {
        underTest = new RankTransformOfAnArray();
    }

    @Test
    public void should_return_correct_result_for_array_input() {
        assertArrayEquals(new int[]{4, 1, 2, 3}, underTest.arrayRankTransform(new int[]{40, 10, 20, 30}));
        assertArrayEquals(new int[]{1, 1, 1}, underTest.arrayRankTransform(new int[]{100, 100, 100}));
        assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}, underTest.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
    }
}