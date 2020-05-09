#include "TwoSum.h"

std::vector<int> twoSum(std::vector<int> &nums, int target) {
    std::sort(nums.begin(), nums.end());
    for (int i = 0; i < nums.size(); i++) {
        std::cout << nums[i] << std::endl;
    }
    return std::vector<int> {1,2};
}