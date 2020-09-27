package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LetterCombinationsOfAPhoneNumberTest {

    private final Map<String, List<String>> phoneNumberMapping = new HashMap<String, List<String>>() {{
        put("2", Arrays.asList("a", "b", "c"));
        put("3", Arrays.asList("d", "e", "f"));
        put("4", Arrays.asList("g", "h", "i"));
        put("5", Arrays.asList("j", "k", "l"));
        put("6", Arrays.asList("m", "n", "o"));
        put("7", Arrays.asList("p", "q", "r", "s"));
        put("8", Arrays.asList("t", "u", "v"));
        put("9", Arrays.asList("w", "x", "y", "z"));
    }};
    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @Before
    public void setup() {
        letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    public void should_return_an_empty_list_for_empty_input() {
        assertEquals(0, letterCombinationsOfAPhoneNumber.letterCombinations("").size());
    }

    @Test
    public void should_return_a_list_of_valid_characters_for_single_input() {
        assertEquals(3, letterCombinationsOfAPhoneNumber.letterCombinations("2").size());
        assertTrue(letterCombinationsOfAPhoneNumber.letterCombinations("2")
                .containsAll(phoneNumberMapping.get("2")));
    }

    @Test
    public void should_return_a_correct_list_of_valid_characters_for_double_input() {
        assertEquals(9, letterCombinationsOfAPhoneNumber.letterCombinations("23").size());
        assertTrue(letterCombinationsOfAPhoneNumber.letterCombinations("23")
                .containsAll(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    public void should_return_a_correct_list_of_valid_characters_for_multiple_identical_input() {
        assertEquals(27, letterCombinationsOfAPhoneNumber.letterCombinations("555").size());
        assertTrue(letterCombinationsOfAPhoneNumber.letterCombinations("555")
                .containsAll(Arrays.asList("jjj", "jjk", "jjl", "jkj", "jkk", "jkl", "jlj", "jlk", "jll", "kjj",
                        "kjk", "kjl", "kkj", "kkk", "kkl", "klj", "klk", "kll", "ljj", "ljk", "ljl", "lkj", "lkk",
                        "lkl", "llj", "llk", "lll")));
    }

    @Test
    public void should_return_a_correct_list_of_valid_characters_for_large_input() {
        assertEquals(36, letterCombinationsOfAPhoneNumber.letterCombinations("952").size());
        assertTrue(letterCombinationsOfAPhoneNumber.letterCombinations("952")
                .containsAll(Arrays.asList("wja", "wjb", "wjc", "wka", "wkb", "wkc", "wla", "wlb", "wlc", "xja", "xjb", "xjc", "xka", "xkb", "xkc", "xla", "xlb", "xlc", "yja", "yjb", "yjc", "yka", "ykb", "ykc", "yla", "ylb", "ylc", "zja", "zjb", "zjc", "zka", "zkb", "zkc", "zla", "zlb", "zlc")));
    }
}
