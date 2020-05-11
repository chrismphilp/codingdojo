#include "TwoSumTest.h"
using::testing::ElementsAre;

TEST(TwoSum, should_return_the_correct_indexes_for_small_array) {
    TwoSum twoSum;
    std::vector<int> array = { 3, 2, 4 };
    ASSERT_THAT(twoSum.twoSum(array, 6), ElementsAre(1, 2));
}

TEST(TwoSum, should_return_the_correct_indexes_with_negative_value_array) {
    TwoSum twoSum;
    std::vector<int> array = { -25, -45, -5, 35, 45 };
    ASSERT_THAT(twoSum.twoSum(array, 20), ElementsAre(0, 4));
}

TEST(TwoSum, should_return_the_correct_indexes_with_an_array_with_a_zero_value) {
    TwoSum twoSum;
    std::vector<int> array = { -25, -15, -5, 15, 45, 55, 65 };
    ASSERT_THAT(twoSum.twoSum(array, 0), ElementsAre(1, 3));
}

TEST(TwoSum, should_return_the_correct_indexes_with_a_negative_target) {
    TwoSum twoSum;
    std::vector<int> array = { -25, -15, -5, 15, 45, 55, 65 };
    ASSERT_THAT(twoSum.twoSum(array, -40), ElementsAre(0, 1));
}

TEST(TwoSum, should_return_the_correct_indexes_with_an_unordered_array) {
    TwoSum twoSum;
    std::vector<int> array = { -25, 65, 15, 0, -15, -5, 15, 45, 55, -15, 65 };
    ASSERT_THAT(twoSum.twoSum(array, 130), ElementsAre(1, 10));
}
