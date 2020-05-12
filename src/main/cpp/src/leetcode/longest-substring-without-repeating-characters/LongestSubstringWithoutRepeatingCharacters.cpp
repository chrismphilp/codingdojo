#include "LongestSubstringWithoutRepeatingCharacters.h"

// Once a repeated letter is found, increase lowerBound until the same letter is found
int LongestSubstringWithoutRepeatingCharacters::lengthOfLongestSubstring(std::string s) {
    int stringLength = s.length();
    if (stringLength == 0) return 0;
    if (stringLength == 1) return 1;

    std::array<int, 256> asciiValues{};
    int lowerBound = 0;
    int upperBound = 0;
    int count = 0;
    int currentMax = 1;
    bool up = true;

    while (lowerBound <= upperBound && upperBound < stringLength) {

        if (up) {
            int valueAtUpperBound = int(s.at(upperBound));

            if (asciiValues[valueAtUpperBound] > 0) {
                asciiValues[valueAtUpperBound]++;
                up = false;
            } else {
                count++;
                if (count > currentMax) currentMax = count;
                asciiValues[valueAtUpperBound]++;
                upperBound++;
            }
        } else {
            char charAtLowerBound = s.at(lowerBound);
            char charAtUpperBound = s.at(upperBound);

            while (charAtLowerBound != charAtUpperBound) {
                asciiValues[int(charAtLowerBound)]--;
                lowerBound++;
                count--;
                charAtLowerBound = s.at(lowerBound);
            }
            asciiValues[int(s.at(lowerBound))]--;
            lowerBound++;
            upperBound++;
            up = true;
        }

    }
    return currentMax;
}
