package leet_code.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinimumNumberOfVerticesToReachAllNodesTest {

    private MinimumNumberOfVerticesToReachAllNodes minimumNumberOfVerticesToReachAllNodes;

    @Before
    public void setup() {
        minimumNumberOfVerticesToReachAllNodes = new MinimumNumberOfVerticesToReachAllNodes();
    }

    @Test
    public void node_joined_to_all_other_nodes_should_return_single_node() {
        List<Integer> result = minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(5, Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(0, 3),
                Arrays.asList(0, 4),
                Arrays.asList(0, 5))
        );
        assertEquals(1, result.size());
        assertTrue(result.contains(0));
    }

    @Test
    public void should_return_correct_nodes_for_partially_connected_graph() {
        List<Integer> result = minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(5, Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4),
                Arrays.asList(4, 2)
        ));
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(0, 3)));
    }

    @Test
    public void should_return_all_single_node_for_single_edge_connection_graph() {
        List<Integer> result = minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(5, Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(4, 5)
        ));
        assertEquals(1, result.size());
        assertTrue(result.contains(0));
    }
}
