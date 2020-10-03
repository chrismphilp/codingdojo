package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringsTest {

    private MultiplyStrings multiplyStrings;

    @Before
    public void setup() {
        multiplyStrings = new MultiplyStrings();
    }

    @Test
    public void zero_input_should_return_zero_output_string() {
        assertEquals("0", multiplyStrings.multiply("0", "555"));
        assertEquals("0", multiplyStrings.multiply("555", "0"));
    }

    @Test
    public void single_digit_input_should_return_correct_value() {
        assertEquals("1", multiplyStrings.multiply("1", "1"));
        assertEquals("25", multiplyStrings.multiply("5", "5"));
        assertEquals("81", multiplyStrings.multiply("9", "9"));
        assertEquals("9", multiplyStrings.multiply("9", "1"));
    }

    @Test
    public void multiple_digit_input_should_return_correct_value() {
        assertEquals("2044256", multiplyStrings.multiply("1544", "1324"));
        assertEquals("989901", multiplyStrings.multiply("9999", "99"));
        assertEquals("2364398475", multiplyStrings.multiply("4354325", "543"));
        assertEquals("8856758498033836", multiplyStrings.multiply("2564534534", "3453554"));
    }
}
