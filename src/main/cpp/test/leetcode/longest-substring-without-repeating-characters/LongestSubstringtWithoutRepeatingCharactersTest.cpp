#include "LongestSubstringtWithoutRepeatingCharactersTest.h"

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnZeroForEmptyStrings) {
    std::string s;
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 0);
};

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnOneForSingleLengthStrings) {
    std::string s = "a";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 1);
};

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForAlternatingString) {
    std::string s = "ababab";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 2);
};
