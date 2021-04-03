package leet_code.medium;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < boxes.length(); i++) {
            if (i > 0) {
                res[i] = res[i - 1] + count;
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        count = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            if (i < boxes.length() - 1) {
                sum += count;
                res[i] += sum;
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }
        return res;
    }
}
