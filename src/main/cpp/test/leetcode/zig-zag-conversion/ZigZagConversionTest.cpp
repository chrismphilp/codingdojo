#include "ZigZagConversionTest.h"

TEST_F(ZigZagConversionTest, ShouldReturnTheSameStringForASingleRow) {
    std::string word = "ZIGZAG";
    ASSERT_EQ(zigZagConversion.convert(word, 0), word);
    ASSERT_EQ(zigZagConversion.convert(word, 1), word);
}

TEST_F(ZigZagConversionTest, ShouldReturnTheCorrectStringForTwoRows) {
    ASSERT_EQ(zigZagConversion.convert("ABCDEF", 2), "");
}

TEST_F(ZigZagConversionTest, ShouldReturnTheCorrectStringForThreeRows) {
//    ASSERT_EQ(zigZagConversion.convert("ABCDEF", 3), "AEBDFC");
}
