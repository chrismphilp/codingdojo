package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubsetsTest {

    private Subsets subsets;

    @Before
    public void setup() {
        subsets = new Subsets();
    }

    @Test
    public void should_return_correct_set_for_empty_list() {
        assertEquals(new ArrayList<List<Integer>>() {{
            add(new ArrayList<>());
        }}, subsets.subsets(new int[]{}));
    }

    @Test
    public void should_return_correct_set_for_filled_set() {
        List<List<Integer>> result = new ArrayList<List<Integer>>() {{
            add(new ArrayList<Integer>());
            add(new ArrayList<Integer>() {{
                add(1);
            }});
            add(new ArrayList<Integer>() {{
                add(2);
            }});
            add(new ArrayList<Integer>() {{
                add(1);
                add(2);
            }});
        }};
        assertEquals(result, subsets.subsets(new int[]{1, 2}));
    }
}
