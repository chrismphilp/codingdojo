#include "LongestPalindromicSubstring.h"

std::string LongestPalindromicSubstring::longestPalindrome(std::string s) {
    int stringLength = s.length();
    if (stringLength <= 1) return s;

    std::string longestPalindromicSubstring = s.substr(0, 1);
    int longestPalindromicSubstringLength = 1;
    int currentIndex = 1;
    int lowerBound = 0;
    int upperBound = 0;

    while (currentIndex < stringLength) {
        // Odd palindromic strings
        lowerBound = upperBound = currentIndex;

        while ((lowerBound - 1) >= 0 && (upperBound + 1) < stringLength
               && s.at(lowerBound - 1) == s.at(upperBound + 1)) {
            lowerBound--;
            upperBound++;
        }

        int lengthOfPalindrome = upperBound - lowerBound + 1;
        if (lengthOfPalindrome > longestPalindromicSubstringLength) {
            longestPalindromicSubstring = s.substr(lowerBound, lengthOfPalindrome);
            longestPalindromicSubstringLength = lengthOfPalindrome;
        }

        // Even palindromic strings
        lowerBound = currentIndex - 1;
        upperBound = currentIndex;

        while (lowerBound >= 0 && upperBound < stringLength && s.at(lowerBound) == s.at(upperBound)) {
            lowerBound--;
            upperBound++;
        }
        lowerBound++;
        upperBound--;

        lengthOfPalindrome = upperBound - lowerBound + 1;
        if (lengthOfPalindrome > longestPalindromicSubstringLength) {
            longestPalindromicSubstring = s.substr(lowerBound, lengthOfPalindrome);
            longestPalindromicSubstringLength = lengthOfPalindrome;
        }

        currentIndex++;
    }
    return longestPalindromicSubstring;
}
