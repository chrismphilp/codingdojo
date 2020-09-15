#include "ElementIndexInSortedArrayTest.h"

TEST_F(ElementIndexInSortedArrayTest, ShouldReturnTheCorrectIndexForSmallArray) {
    std::vector<int> array = { 5, 15, 25 };
    EXPECT_EQ(elementIndexInSortedArray.findIndex(array, 5), 5);
}
