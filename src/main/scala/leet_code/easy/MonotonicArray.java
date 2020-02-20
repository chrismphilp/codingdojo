package leet_code.easy;

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean monotonicIncreasing = true;
        boolean monotonicDecreasing = true;

        for (int i = 0; i < A.length - 1; i ++) {
            if (!monotonicDecreasing && !monotonicIncreasing) return false;
            if (A[i] > A[i+1] && monotonicIncreasing) monotonicIncreasing = false;
            if (A[i] < A[i+1] && monotonicDecreasing) monotonicDecreasing = false;
        }
        return monotonicDecreasing || monotonicIncreasing;
    }
}
