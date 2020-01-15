package cracking_the_coding_interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintAllPermutationsOfAStringTest {

    PrintAllPermutationsOfAString printAllPermutationsOfAString;

    @BeforeEach
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
