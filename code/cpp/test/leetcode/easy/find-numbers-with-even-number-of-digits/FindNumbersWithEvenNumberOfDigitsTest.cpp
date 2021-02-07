#include "FindNumbersWithEvenNumberOfDigitsTest.h"

TEST_F(FindNumbersWithEvenNumberOfDigitsTest, ShouldReturnCorrectResultForExampleOne) {
    std::vector v = {12, 345, 2, 6, 7896};
    ASSERT_EQ(findNumbersWithEvenNumberOfDigits.findNumbers(v), 2);
}

TEST_F(FindNumbersWithEvenNumberOfDigitsTest, ShouldReturnCorrectResultForExampleTwo) {
    std::vector v = {555,901,482,1771};
    ASSERT_EQ(findNumbersWithEvenNumberOfDigits.findNumbers(v), 1);
}
