#include "MinimumNumberOfStepsToMakeTwoStringsAnagramTest.h"

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnCorrectResultForExampleOne) {
    std::string s1 = "bab";
    std::string s2 = "aba";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 1);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 1);
}

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnCorrectResultForExampleTwo) {
    std::string s1 = "leetcode";
    std::string s2 = "practice";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 5);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 5);
}

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnCorrectResultForExampleThree) {
    std::string s1 = "anagram";
    std::string s2 = "mangaar";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 0);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 0);
}

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnCorrectResultForExampleFour) {
    std::string s1 = "xxyyzz";
    std::string s2 = "xxyyzz";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 0);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 0);
}

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnCorrectResultForExampleFive) {
    std::string s1 = "friend";
    std::string s2 = "family";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 4);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 4);
}

TEST_F(MinimumNumberOfStepsToMakeTwoStringsAnagramTest, ShouldReturnStringLengthForAllNonMatchingStrings) {
    std::string s1 = "friend";
    std::string s2 = "pumast";
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minSteps(s1, s2), 6);
    ASSERT_EQ(minimumNumberOfStepsToMakeTwoStringsAnagram.minStepsSpaceEfficient(s1, s2), 6);
}
