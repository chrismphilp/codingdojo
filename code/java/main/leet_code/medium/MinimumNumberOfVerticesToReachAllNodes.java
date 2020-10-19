package leet_code.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> set = IntStream.range(0, n).boxed().collect(Collectors.toSet());
        for (List<Integer> edge : edges) set.remove(edge.get(1));
        return new ArrayList<>(set);
    }
}
