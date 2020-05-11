#include "TwoSum.h"

std::vector<int> TwoSum::twoSum(std::vector<int> &nums, int target) {
    std::unordered_map<int, int> mapOfNumbers;

    for (auto i = 0; i < nums.size(); i++) {
        auto iter = mapOfNumbers.find(target - nums[i]);

        if (iter != mapOfNumbers.end()) {
            return std::vector<int>{iter->second, i};
        }
        mapOfNumbers[nums[i]] = i;
    }
    return std::vector<int>{0, 0};
}