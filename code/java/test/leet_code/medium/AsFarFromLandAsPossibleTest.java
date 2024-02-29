package leet_code.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AsFarFromLandAsPossibleTest {

    private AsFarFromLandAsPossible underTest;

    @Before
    public void setup() {
        underTest = new AsFarFromLandAsPossible();
    }

    @Test
    public void should_return_empty_list_for_even_numbers() {
        assertEquals(4, underTest.maxDistance(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }
}