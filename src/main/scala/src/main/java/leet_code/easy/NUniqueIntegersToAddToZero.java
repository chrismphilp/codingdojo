package leet_code.easy;

public class NUniqueIntegersToAddToZero {
    public int[] sumZero(int n) {
        int[] A = new int[n];
        boolean isEven = n % 2 == 0;
        int currentValue = 1;

        for (int i = (isEven ? 0 : 1); i < n; i += 2) {
            A[i] = Math.negateExact(currentValue);
            A[i + 1] = currentValue++;
        }
        return A;
    }
}
