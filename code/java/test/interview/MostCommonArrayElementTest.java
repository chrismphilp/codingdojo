package interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MostCommonArrayElementTest {

    @Test
    public void empty_array_should_return_null() {
        MostCommonArrayElement<Integer> mostCommonArrayElement = new MostCommonArrayElement<>();
        Integer[] intArray = new Integer[0];
        Integer mostCommon = mostCommonArrayElement.findMostCommonArrayElement(intArray);
        assertNull(mostCommon);
    }

    @Test
    public void int_array_should_return_most_common_element() {
        MostCommonArrayElement<Integer> mostCommonArrayElement = new MostCommonArrayElement<>();
        Integer[] intArray = {1, 2, 3, 4, 5, 5, 5, 5};
        Integer mostCommon = mostCommonArrayElement.findMostCommonArrayElement(intArray);
        assertEquals(5, mostCommon.intValue());
    }

    @Test
    public void object_array_should_return_most_common_element() {
        MostCommonArrayElement<Object> mostCommonArrayElement = new MostCommonArrayElement<>();
        Object[] objectArray = {1, null, 3, null, 5, 3, 5, "Hi", "Hi", "Hi"};
        Object mostCommon = mostCommonArrayElement.findMostCommonArrayElement(objectArray);
        assertEquals("Hi", mostCommon);
    }
}
