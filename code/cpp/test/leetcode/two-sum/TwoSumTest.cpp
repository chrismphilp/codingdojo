#include "TwoSumTest.h"
using::testing::ElementsAre;

TEST_F(TwoSumTest, ShouldReturnTheCorrectIndexesForSmallArray) {
    std::vector<int> array = { 3, 2, 4 };
    ASSERT_THAT(twoSum.twoSum(array, 6), ElementsAre(1, 2));
}

TEST_F(TwoSumTest, ShouldReturnTheCorrectIndexesWithNegativeValueArray) {
    std::vector<int> array = { -25, -45, -5, 35, 45 };
    ASSERT_THAT(twoSum.twoSum(array, 20), ElementsAre(0, 4));
}

TEST_F(TwoSumTest, ShouldReturnTheCorrectIndexesWithAnArrayWithAZeroValue) {
    std::vector<int> array = { -25, -15, -5, 15, 45, 55, 65 };
    ASSERT_THAT(twoSum.twoSum(array, 0), ElementsAre(1, 3));
}

TEST_F(TwoSumTest, ShouldReturnTheCorrectIndexesWithANegativeTarget) {
    std::vector<int> array = { -25, -15, -5, 15, 45, 55, 65 };
    ASSERT_THAT(twoSum.twoSum(array, -40), ElementsAre(0, 1));
}

TEST_F(TwoSumTest, ShouldReturnTheCorrectIndexesWithAnUnorderedArray) {
    std::vector<int> array = { -25, 65, 15, 0, -15, -5, 15, 45, 55, -15, 65 };
    ASSERT_THAT(twoSum.twoSum(array, 130), ElementsAre(1, 10));
}
