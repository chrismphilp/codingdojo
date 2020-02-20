package leet_code.easy;

public class ConvertSumOfIntegerToTwoNonZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int x = n - i;
            if (!Integer.toString(x).contains("0") && !Integer.toString(i).contains("0")) {
                return new int[]{i, x};
            }
        }
        return new int[]{};
    }
}
