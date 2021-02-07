#include "ZigZagConversionTest.h"

TEST_F(ZigZagConversionTest, ShouldReturnTheSameStringForLessThanTwoRows) {
    std::string word = "ZIGZAG";
    ASSERT_EQ(zigZagConversion.convert(word, 0), word);
    ASSERT_EQ(zigZagConversion.convert(word, 1), word);
}

TEST_F(ZigZagConversionTest, ShouldReturnTheCorrectStringForTwoRows) {
    ASSERT_EQ(zigZagConversion.convert("ABC", 2), "ACB");
    ASSERT_EQ(zigZagConversion.convert("ABCDEF", 2), "ACEBDF");
}

TEST_F(ZigZagConversionTest, ShouldReturnTheCorrectStringForThreeRows) {
    ASSERT_EQ(zigZagConversion.convert("ABCD", 3), "ABDC");
    ASSERT_EQ(zigZagConversion.convert("ABCDEF", 3), "AEBDFC");
    ASSERT_EQ(zigZagConversion.convert("ABCDEFGHIJKLMOP", 3), "AEIMBDFHJLOCGKP");
}

TEST_F(ZigZagConversionTest, ShouldReturnTheCorrectStringForFourRows) {
    ASSERT_EQ(zigZagConversion.convert("ABCDEF", 4), "ABFCED");
}
