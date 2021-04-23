package leet_code.medium;

import java.util.*;

public class SortIntegersByThePowerValue {

    Map<Integer, Integer> memoizedMap = new HashMap<>();

    public int getKth(int lo, int hi, int k) {
        int diff = hi - lo;
        if (diff == 0) return lo;

        List<Pair> powerValues = new ArrayList<>(diff + 1);

        for (int i = 0; i < diff + 1; i++) {
            powerValues.add(new Pair(i + lo, powerValue(i + lo)));
        }

        powerValues.sort(Comparator.comparing(a -> a.getSecond()));
        return powerValues.get(k - 1).getFirst();
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

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
