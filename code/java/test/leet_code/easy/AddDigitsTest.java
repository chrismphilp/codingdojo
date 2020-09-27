package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddDigitsTest {

    private AddDigits addDigits;

    @Before
    public void setup() {
        addDigits = new AddDigits();
    }

    @Test
    public void should_return_correct_value() {
        assertEquals(7, addDigits.addDigits(25));
        assertEquals(2, addDigits.addDigits(38));
    }
}
