package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingCharacterTest {

    private FirstNonRepeatingCharacter firstNonRepeatingCharacter;

    @BeforeEach
    public void setup() {
        firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
    }

    @Test
    public void empty_array_should_return_max_value() {
        int[] emptyArray = new int[0];
        assertEquals(Integer.MAX_VALUE, firstNonRepeatingCharacter.findFirstNonRepeatingCharacter(emptyArray));
    }

    @Test
    public void filled_array_should_return_correct_value() {
        int[] filledArray = {0, 1, 5, 2, 1, 0, 6, 9, 3};
        assertEquals(5, firstNonRepeatingCharacter.findFirstNonRepeatingCharacter(filledArray));

        int[] secondFilledArray = {0, 1, 5, 2, 5, 1, 0, 6, 9, 3, 2};
        assertEquals(6, firstNonRepeatingCharacter.findFirstNonRepeatingCharacter(secondFilledArray));
    }
}
