package leet_code.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {

    private AddDigits addDigits;

    @BeforeEach
    public void setup() {
        addDigits = new AddDigits();
    }

    @Test
    public void should_return_correct_value() {
        assertEquals(7, addDigits.addDigits(25));
        assertEquals(2, addDigits.addDigits(38));
    }
}
