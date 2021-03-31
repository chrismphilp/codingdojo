set(LEETCODE_SOURCES
        # Easy
        easy/two-sum/TwoSum.cpp
        easy/two-sum/TwoSum.h
        easy/add-two-numbers/AddTwoNumbers.cpp
        easy/add-two-numbers/AddTwoNumbers.h
        easy/longest-substring-without-repeating-characters/LongestSubstringWithoutRepeatingCharacters.cpp
        easy/longest-substring-without-repeating-characters/LongestSubstringWithoutRepeatingCharacters.h
        easy/longest-palindromic-substring/LongestPalindromicSubstring.cpp
        easy/longest-palindromic-substring/LongestPalindromicSubstring.h
        easy/zig-zag-conversion/ZigZagConversion.cpp
        easy/zig-zag-conversion/ZigZagConversion.h
        easy/find-numbers-with-even-number-of-digits/FindNumbersWithEvenNumberOfDigits.cpp
        easy/find-numbers-with-even-number-of-digits/FindNumbersWithEvenNumberOfDigits.h
        # Medium
        medium/minimum-number-of-steps-to-make-two-strings-anagram/MinimumNumberOfStepsToMakeTwoStringsAnagram.cpp
        medium/minimum-number-of-steps-to-make-two-strings-anagram/MinimumNumberOfStepsToMakeTwoStringsAnagram.h
        )

add_library(leetcode_lib STATIC
        ${LEETCODE_SOURCES}
        )

target_include_directories(leetcode_lib PUBLIC
        # Easy
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/two-sum
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/add-two-numbers
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/longest-substring-without-repeating-characters
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/longest-palindromic-substring
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/zig-zag-conversion
        ${CMAKE_CURRENT_SOURCE_DIR}/easy/find-numbers-with-even-number-of-digits
        # Medium
        ${CMAKE_CURRENT_SOURCE_DIR}/medium/minimum-number-of-steps-to-make-two-strings-anagram
        )
