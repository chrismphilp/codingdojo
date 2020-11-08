package leet_code.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegersByThePowerValue {
    public int getKth(int lo, int hi, int k) {
        List<Integer> sort = new ArrayList<>(hi - lo);
        List<Integer> powerValues = new ArrayList<>(hi - lo);

        int index = 0;
        for (int i = lo; i <= hi; i++) {
            sort.add(index, i);
            powerValues.add(index++, powerValue(i));
        }
        sort.sort(Comparator.comparing(a -> powerValues.get(a - lo)));
        return sort.get(k - 1);
    }

    private Integer powerValue(int val) {
        int count = 0;
        while (val != 1) {
            if (val % 2 == 0) val /= 2;
            else val = 3 * val + 1;
            count++;
        }
        return count;
    }
}
