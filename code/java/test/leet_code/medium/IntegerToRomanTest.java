package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @Before
    public void setup() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void single_digit_input_should_return_correct_numeral() {
        assertEquals("I", integerToRoman.intToRoman(1));
        assertEquals("II", integerToRoman.intToRoman(2));
        assertEquals("III", integerToRoman.intToRoman(3));
        assertEquals("IV", integerToRoman.intToRoman(4));
        assertEquals("V", integerToRoman.intToRoman(5));
        assertEquals("VI", integerToRoman.intToRoman(6));
        assertEquals("VII", integerToRoman.intToRoman(7));
        assertEquals("VIII", integerToRoman.intToRoman(8));
        assertEquals("IX", integerToRoman.intToRoman(9));
    }

    @Test
    public void double_digit_input_should_return_correct_numeral() {
        assertEquals("L", integerToRoman.intToRoman(50));
        assertEquals("LV", integerToRoman.intToRoman(55));
        assertEquals("C", integerToRoman.intToRoman(100));
        assertEquals("M", integerToRoman.intToRoman(1000));
        assertEquals("MDXLIX", integerToRoman.intToRoman(1549));
        assertEquals("MMMCMXCIX", integerToRoman.intToRoman(3999));
    }
}
