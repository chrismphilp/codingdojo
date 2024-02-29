package leet_code.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortIntegersByThePowerValue {

    Map<Integer, Integer> memoizedMap = new HashMap<>();

    public int getKth(int lo, int hi, int k) {
        int diff = hi - lo;
        if (diff == 0) return lo;

        List<Pair<Integer, Integer>> powerValues = new ArrayList<>(diff + 1);

        for (int i = 0; i < diff + 1; i++) {
            powerValues.add(new Pair<>(i + lo, powerValue(i + lo)));
        }

        powerValues.sort(Comparator.comparing(Pair::getValue));
        return powerValues.get(k - 1).getKey();
    }

    private int powerValue(int val) {
        if (val == 1) {
            return 0;
        } else if (memoizedMap.containsKey(val)) {
            return memoizedMap.get(val);
        } else if (val % 2 == 0) {
            memoizedMap.put(val, 1 + powerValue(val / 2));
        } else {
            memoizedMap.put(val, 1 + powerValue(3 * val + 1));
        }
        return memoizedMap.get(val);
    }
}

class Pair<K, V> {
    private final K first;
    private final V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getKey() {
        return first;
    }

    public V getValue() {
        return second;
    }
}
