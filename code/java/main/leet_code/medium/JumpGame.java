package leet_code.medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;

        boolean[] passable = new boolean[nums.length];
        passable[0] = true;

        for (int i = 0; i < nums.length; i++) {
            if (passable[nums.length - 1]) return true;
            for (int j = i; j < nums.length && j <= i + nums[i] && passable[i]; j++) {
                passable[j] = true;
            }
        }
        return passable[nums.length - 1];
    }
}
