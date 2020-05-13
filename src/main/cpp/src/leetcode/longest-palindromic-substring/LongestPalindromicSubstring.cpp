#include "LongestPalindromicSubstring.h"

std::string LongestPalindromicSubstring::longestPalindrome(std::string s) {
    int stringLength = s.length();
    if (stringLength <= 1) return s;

    std::string palindromicSubstring = "";
    int lengthOfLongestPalindromicSubstring = 0;

    for (unsigned int i = 0; i < stringLength; i++) {
        for (unsigned int x = lengthOfLongestPalindromicSubstring; x <= stringLength - i; x++) {
            std::string curr = s.substr(i, x);
            if (isPalindrome(curr) && curr.length() > lengthOfLongestPalindromicSubstring) {
                lengthOfLongestPalindromicSubstring = curr.length();
                palindromicSubstring = curr;
            }
        }
    }
    return palindromicSubstring;
}

bool LongestPalindromicSubstring::isPalindrome(std::string s) {
    int stringLength = s.length();
    if (stringLength <= 1) return true;
    for (unsigned int i = 0; i < (stringLength / 2); i++) {
        if (s.at(i) != s.at(stringLength - 1 - i)) {
            return false;
        }
    }
    return true;
}
