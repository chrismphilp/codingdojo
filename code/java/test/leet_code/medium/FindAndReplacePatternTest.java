package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindAndReplacePatternTest {

    private FindAndReplacePattern findAndReplacePattern;

    @Before
    public void setup() {
        findAndReplacePattern = new FindAndReplacePattern();
    }

    @Test
    public void should_return_empty_list_for_empty_words_input() {
        assertTrue(findAndReplacePattern.findAndReplacePattern(new String[]{}, "").isEmpty());
        assertTrue(findAndReplacePattern.findAndReplacePattern(new String[]{}, "a").isEmpty());
        assertTrue(findAndReplacePattern.findAndReplacePattern(new String[]{}, "aaa").isEmpty());
    }

    @Test
    public void should_return_correct_result_for_example_one() {
        List<String> result = findAndReplacePattern.findAndReplacePattern(
                new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        assertTrue(result.contains("mee"));
        assertTrue(result.contains("aqq"));
        assertEquals(2, result.size());
    }

    @Test
    public void should_return_all_words_when_all_match_the_pattern() {
        List<String> result = findAndReplacePattern.findAndReplacePattern(
                new String[]{"123", "are", "abc", "tyu", "pR0", "QWE"}, "abc");
        assertTrue(result.contains("123"));
        assertTrue(result.contains("are"));
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("tyu"));
        assertTrue(result.contains("pR0"));
        assertTrue(result.contains("QWE"));
        assertEquals(6, result.size());
    }

    @Test
    public void should_return_no_words_when_none_match_the_pattern() {
        List<String> result = findAndReplacePattern.findAndReplacePattern(
                new String[]{"aab", "deq", "mee", "aqq", "dkd", "cca"}, "aaa");
        assertTrue(result.isEmpty());
    }
}
