package leet_code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void setup() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void should_return_correct_value_for_simple_numerals() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(5, romanToInteger.romanToInt("V"));
        assertEquals(7, romanToInteger.romanToInt("VII"));
        assertEquals(20, romanToInteger.romanToInt("XX"));
    }

    @Test
    public void should_return_correct_value_for_complicated_numerals() {
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
        assertEquals(2004, romanToInteger.romanToInt("MCMXCXIV"));
        assertEquals(40, romanToInteger.romanToInt("XL"));
        assertEquals(3999, romanToInteger.romanToInt("MMMIM"));
    }
}
