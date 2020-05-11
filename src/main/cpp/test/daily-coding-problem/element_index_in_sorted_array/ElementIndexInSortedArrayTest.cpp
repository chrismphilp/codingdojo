#include "ElementIndexInSortedArrayTest.h"

TEST(ElementIndexInSortedArrayTest, ShouldReturnTheCorrectIndexForSmallArray) {
    ElementIndexInSortedArray elementIndexInSortedArray;
    std::vector<int> array = { 5, 15, 25 };
    EXPECT_EQ(elementIndexInSortedArray.findIndex(array, 5), 5);
}
