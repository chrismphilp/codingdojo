package leet_code.easy;

public class SumOfAllOddLengthSubArrays {
    public int sumOddLengthSubArrays(int[] arr) {
        int sum = 0;
        int marker = 0;
        while (marker < arr.length) {
            int lower = 0;
            int upper = marker;

            while (upper < arr.length) {
                for (int i = lower; i <= upper; i++) {
                    sum += arr[i];
                }
                lower++;
                upper++;
            }
            marker += 2;
        }
        return sum;
    }
}
