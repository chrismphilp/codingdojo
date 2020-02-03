package daily_coding_problems;

public class FirstMissingPositiveInteger {
    public int solution(int[] nums) {
        int x = 0;

        while (x < nums.length) {
            int valueAtIndex = nums[x];

            if (valueAtIndex <= 0 ||
                    valueAtIndex >= nums.length ||
                    valueAtIndex == x + 1 ||
                    valueAtIndex == nums[valueAtIndex - 1]) {
                x++;
            } else swap(nums, x, valueAtIndex - 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
            if (i == nums.length - 1) return nums[i] + 1;
        }
        return 1;
    }

    private void swap(int[] nums, int index, int numberAtIndex) {
        int tmp = nums[index];
        nums[index] = nums[numberAtIndex];
        nums[numberAtIndex] = tmp;
    }
}
