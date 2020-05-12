#include "LongestSubstringWithoutRepeatingCharactersTest.h"

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnZeroForEmptyStrings) {
    std::string s;
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 0);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnOneForSingleLengthStrings) {
    std::string s = "a";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 1);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForAlternatingString) {
    std::string s = "abbbab";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 2);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForFullNonRepeatingString) {
    std::string s = "abcdef";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 6);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForLongerRepeatingString) {
    std::string s = "aaabbbccc";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 2);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForSymmetricalString) {
    std::string s = "123454321";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 5);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForNonRepeatingEndingString) {
    std::string s = "ababababcdef";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 6);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForSlightlyRepeatingString) {
    std::string s = "abbcdea";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 5);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForLongerString) {
    std::string s = "aabcbcadef";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 6);
}

TEST_F(LongestSubstringWithoutRepeatingCharactersTest, ShouldReturnCorrectValueForEvenLongerString) {
    std::string s = "aababcdcdddaf";
    ASSERT_EQ(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s), 4);
}
