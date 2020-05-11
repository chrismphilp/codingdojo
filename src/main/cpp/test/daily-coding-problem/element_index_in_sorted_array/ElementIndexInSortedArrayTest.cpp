#include "ElementIndexInSortedArrayTest.h"

TEST(ElementIndexInSortedArrayTest, should_return_the_correct_index_for_small_array) {
    ElementIndexInSortedArray elementIndexInSortedArray;
    std::vector<int> array = { 5, 15, 25 };
    EXPECT_EQ(elementIndexInSortedArray.findIndex(array, 5), 5);
}
