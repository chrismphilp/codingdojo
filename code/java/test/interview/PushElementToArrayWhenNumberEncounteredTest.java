package interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PushElementToArrayWhenNumberEncounteredTest {

    private PushElementToArrayWhenNumberEncountered pushElementToArray;

    @Before
    public void setup() {
        pushElementToArray = new PushElementToArrayWhenNumberEncountered();
    }

    @Test
    public void should_return_correct_array() {
        int[] testArrayOne = {1, 2, 1, 2};
        assertArrayEquals(new int[]{1, 2, 2, 1}, pushElementToArray.pushElementToArrayWhenNumberEncountered(testArrayOne, 2));

        int[] testArrayTwo = {2, 2, 2, 2};
        assertArrayEquals(testArrayTwo, pushElementToArray.pushElementToArrayWhenNumberEncountered(testArrayTwo, 2));

        int[] testArrayThree = {1, 2, 2, 4, 6};
        assertArrayEquals(new int[]{1, 2, 2, 2, 2}, pushElementToArray.pushElementToArrayWhenNumberEncountered(testArrayThree, 2));
    }
}
