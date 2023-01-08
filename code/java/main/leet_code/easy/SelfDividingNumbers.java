package leet_code.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 10 != 0 && isSelfDividing(i)) {
                nums.add(i);
            }
        }
        return nums;
    }

    private boolean isSelfDividing(int n) {
        int num = n;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0 || n % digit != 0) return false;
            num /= 10;
        }
        return true;
    }
}
