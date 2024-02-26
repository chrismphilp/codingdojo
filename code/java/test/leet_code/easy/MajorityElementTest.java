package leet_code.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MajorityElementTest {

    private MajorityElement underTest;

    @Before
    public void setup() {
        underTest = new MajorityElement();
    }

    @Test
    public void should_return_the_correct_result_for_simple_solution() {
        assertEquals(3, underTest.majorityElementSimple(new int[]{3}));
        assertEquals(3, underTest.majorityElementSimple(new int[]{3,2,3}));
        assertEquals(2, underTest.majorityElementSimple(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    public void should_return_the_correct_result_for_linear_solution() {
        assertEquals(3, underTest.majorityElement(new int[]{3}));
        assertEquals(3, underTest.majorityElement(new int[]{3,2,3}));
        assertEquals(2, underTest.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
