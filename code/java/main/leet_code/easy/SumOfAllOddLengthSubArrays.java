package leet_code.easy;

public class SumOfAllOddLengthSubArrays {
    public int sumOddLengthSubArrays(int[] arr) {
        int[] totals = new int[arr.length];
        int sum = 0;
        totals[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            totals[i] += arr[i] + totals[i - 1];
        }

        for (int i = 0; i < arr.length; i += 2) {
            int lower = 0;
            int upper = i;

            while (upper < arr.length) {
                sum += totals[upper] - (lower - 1 >= 0 ? totals[lower - 1] : 0);
                lower++;
                upper++;
            }
        }
        return sum;
    }
}
