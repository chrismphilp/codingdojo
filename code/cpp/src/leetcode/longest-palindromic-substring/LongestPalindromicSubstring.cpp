#include "LongestPalindromicSubstring.h"

std::string LongestPalindromicSubstring::longestPalindrome(std::string s) {
    int stringLength = s.length();
    if (stringLength <= 1) return s;

    int currentBuffer = stringLength;
    int startingIndex = 0;

    while (currentBuffer != 1) {
        while (startingIndex + currentBuffer <= stringLength) {
            std::string curr = s.substr(startingIndex, currentBuffer);
            if (isPalindrome(curr)) return curr;
            startingIndex++;
        }
        startingIndex = 0;
        currentBuffer--;
    }
    return s.substr(0, 1);
}

bool LongestPalindromicSubstring::isPalindrome(std::string s) {
    int stringLength = s.length();
    if (stringLength <= 1) return true;
    for (unsigned int i = 0; i < (stringLength / 2); i++) {
        if (s.at(i) != s.at(stringLength - 1 - i)) return false;
    }
    return true;
}
