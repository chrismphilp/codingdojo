package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @Before
    public void setup() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void should_return_empty_list_for_empty_array() {
        assertEquals(Collections.EMPTY_LIST, groupAnagrams.groupAnagrams(new String[]{}));
    }

    @Test
    public void should_return_single_element_list_for_single_element_array() {
        assertEquals(Collections.singletonList(Collections.singletonList("tea")),
                groupAnagrams.groupAnagrams(new String[]{"tea"}));
    }

    @Test
    public void should_return_correct_values_for_multiple_element_array() {
        List<List<String>> res1 = groupAnagrams.groupAnagrams(new String[]{"tea", "eat", "ate", "bae"});
        assertTrue(res1.contains(Arrays.asList("tea", "eat", "ate")));
        assertTrue(res1.contains(Collections.singletonList("bae")));

        List<List<String>> res2 = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertTrue(res2.contains(Arrays.asList("eat", "tea", "ate")));
        assertTrue(res2.contains(Arrays.asList("tan", "nat")));
        assertTrue(res2.contains(Collections.singletonList("bat")));
    }
}
