package daily_coding_problem;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbersFromListAddToK {
    public boolean calculate(int[] numbers, int k) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int number : numbers) {
            int target = k - number;
            if (numberMap.containsKey(target)) return true;
            numberMap.put(number, 0);
        }
        return false;
    }
}
