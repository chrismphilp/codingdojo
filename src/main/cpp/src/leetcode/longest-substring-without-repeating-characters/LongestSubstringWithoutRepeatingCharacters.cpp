#include "LongestSubstringWithoutRepeatingCharacters.h"

int LongestSubstringWithoutRepeatingCharacters::lengthOfLongestSubstring(std::string s) {
    int stringLength = s.length();
    if (stringLength == 0) return 0;
    if (stringLength == 1) return 1;

    std::array<int, 256> asciiValues{};
    int lowerBound = 0;
    int upperBound = 1;
    bool up = true;

    while (lowerBound != upperBound || upperBound == stringLength) {

        int charValue = int(s.at(lowerBound));

        if (asciiValues[charValue] > 0) {
            if (up) {
                asciiValues[int(s.at(lowerBound))]--;
                lowerBound++;
            } else {

            }
        } else {
            if (up) upperBound++;
            else lowerBound++;
        }

    }
    return 0;
}
