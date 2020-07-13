package cracking_the_coding_interview;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PrintAllPermutationsOfAStringTest {

    PrintAllPermutationsOfAString printAllPermutationsOfAString;

    @Before
    public void setup() {
        printAllPermutationsOfAString = new PrintAllPermutationsOfAString();
    }

    @Test
    public void should_return_correct_permutations() {
        Set<String> variations = printAllPermutationsOfAString.calculate("ab");
        assertEquals(new HashSet<String>() {{
            add("a");
            add("ab");
            add("ba");
        }}, variations);
    }
}
