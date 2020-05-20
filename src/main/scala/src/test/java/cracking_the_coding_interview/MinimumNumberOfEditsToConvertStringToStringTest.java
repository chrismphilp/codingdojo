package cracking_the_coding_interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfEditsToConvertStringToStringTest {

    private MinimumNumberOfEditsToConvertStringToString minimumNumberOfEditsToConvertStringToString;

    @BeforeEach
    public void setup() {
        minimumNumberOfEditsToConvertStringToString = new MinimumNumberOfEditsToConvertStringToString();
    }

    @Test
    public void should_return_zero_for_matching_strings() {
        String a = "boob";
        String b = "boob";
        assertEquals(0, minimumNumberOfEditsToConvertStringToString.calculate(
                a.toCharArray(), b.toCharArray()));
    }

    @Test
    public void should_return_correct_value_of_one_for_one_character_difference() {
        String a = "p";
        String b = "py";
        assertEquals(1, minimumNumberOfEditsToConvertStringToString.calculate(
                a.toCharArray(), b.toCharArray()));
    }

    @Test
    public void should_return_correct_value_for_multiple_character_difference() {
        String a = "party";
        String b = "barter";
        assertEquals(3, minimumNumberOfEditsToConvertStringToString.calculate(
                a.toCharArray(), b.toCharArray()));
    }
}
