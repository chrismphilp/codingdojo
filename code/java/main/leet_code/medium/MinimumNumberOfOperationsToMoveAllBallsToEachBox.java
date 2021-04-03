package leet_code.medium;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int[] left = new int[boxes.length()];
        int[] right = new int[boxes.length()];
        int[] res = new int[boxes.length()];

        int count = 0;
        for (int i = 0; i < boxes.length(); i++) {
            if (i > 0) {
                left[i] = left[i - 1] + count;
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        count = 0;
        for (int i = boxes.length() - 1; i >= 0; i--) {
            if (i < boxes.length() - 1) {
                right[i] = right[i + 1] + count;
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        for (int i = 0; i < boxes.length(); i++) {
            res[i] = left[i] + right[i];
        }

        return res;
    }
}
