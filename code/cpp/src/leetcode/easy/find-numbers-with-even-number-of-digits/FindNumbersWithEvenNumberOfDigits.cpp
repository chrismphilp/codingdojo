#include "FindNumbersWithEvenNumberOfDigits.h"

int FindNumbersWithEvenNumberOfDigits::findNumbers(std::vector<int> &nums) {
    int count = 0;
    for (int num : nums) {
        std::string s = std::to_string(num);
        if (s.size() % 2 == 0) {
            count++;
        }
    }
    return count;
}
