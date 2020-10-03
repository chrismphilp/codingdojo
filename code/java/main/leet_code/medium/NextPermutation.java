package leet_code.medium;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        int a = -1;
        int b = -1;

        for (int i = nums.length - 1; i >= 1; i--) {
            int lower = nums[i];
            int upper = nums[i - 1];

            if (upper < lower) {
                b = i;
                a = i - 1;
                swapIndexValues(nums, b, a);
                break;
            }
        }

        if (b == -1) reverseArray(nums);
        else {
            int c = -1;
            for (int i = nums.length - 1; i >= a; i--) {
                if (nums[i] < nums[a] && nums[i] > nums[b]) {
                    if (c == -1) c = i;
                    else if (nums[i] < nums[c]) c = i;
                }
            }

            if (c != -1) swapIndexValues(nums, c, a);

            for (int i = b; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) swapIndexValues(nums, i, j);
                }
            }
        }
    }

    private void swapIndexValues(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }
}
