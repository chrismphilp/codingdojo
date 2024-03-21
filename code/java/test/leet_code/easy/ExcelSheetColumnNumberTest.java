package leet_code.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {

    private ExcelSheetColumnNumber underTest;

    @Before
    public void setup() {
        underTest = new ExcelSheetColumnNumber();
    }

    @Test
    public void should_not_remove_root_node_even_if_it_is_the_target() {
        assertEquals(1, underTest.titleToNumber("A"));
        assertEquals(26, underTest.titleToNumber("Z"));
        assertEquals(27, underTest.titleToNumber("AA"));
        assertEquals(701, underTest.titleToNumber("ZY"));
        assertEquals(17764, underTest.titleToNumber("ZGF"));
    }
}