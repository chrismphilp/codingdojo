package leet_code.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSegmentsInAStringTest {

    NumberOfSegmentsInAString numberOfSegmentsInAString;

    @BeforeEach
    public void setup() {
        numberOfSegmentsInAString = new NumberOfSegmentsInAString();
    }

    @Test
    public void empty_string_should_return_zero() {
       assertEquals(0, numberOfSegmentsInAString.countSegments("     "));
       assertEquals(0, numberOfSegmentsInAString.countSegments(""));
    }

    @Test
    public void string_with_consecutive_spaces_should_only_count_as_one() {
        assertEquals(5, numberOfSegmentsInAString.countSegments(" a b c        b d"));
        assertEquals(5, numberOfSegmentsInAString.countSegments(" a b c        b   d   "));
    }

    @Test
    public void should_return_the_correct_number_of_segments() {
        assertEquals(2, numberOfSegmentsInAString.countSegments("Chris Philp"));
        assertEquals(2, numberOfSegmentsInAString.countSegments("Chris    Philp"));
        assertEquals(2, numberOfSegmentsInAString.countSegments("Chris    Philp   "));
    }
}
