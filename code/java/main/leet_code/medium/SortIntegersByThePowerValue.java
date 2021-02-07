package leet_code.medium;

import java.util.*;

// TODO: Finish memoized approach
public class SortIntegersByThePowerValue {
    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> memoizedMap = new HashMap<>();
        List<Integer> sort = new ArrayList<>(hi - lo);
        List<Integer> powerValues = new ArrayList<>(hi - lo);

        int index = 0;
        for (int i = lo; i <= hi; i++) {
            sort.add(index, i);
            powerValues.add(index++, powerValue(memoizedMap, i));
        }
        sort.sort(Comparator.comparing(a -> powerValues.get(a - lo)));
        return sort.get(k - 1);
    }

    private Integer powerValue(Map<Integer, Integer> memoizedMap, int val) {
        int count = 0;
        while (val != 1) {
            if (memoizedMap.containsKey(val)) {
                return memoizedMap.get(val);
            } else if (val % 2 == 0) {
                memoizedMap.put(count, val);
                val /= 2;
            } else {
                memoizedMap.put(count, val);
                val = 3 * val + 1;
            }
            count++;
        }
        return count;
    }
}
