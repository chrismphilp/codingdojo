#include "MinimumNumberOfStepsToMakeTwoStringsAnagram.h"

// TODO: Improve runtime
int MinimumNumberOfStepsToMakeTwoStringsAnagram::minSteps(std::string s, std::string t) {

    int count = 0;
    int map[26] = {0};

    for (int i = 0; i < t.length(); i++) {
        int charValue = t[i] - 97;
        map[charValue] += 1;
    }

    for (int i = 0; i < s.length(); i++) {
        int charValue = s[i] - 97;
        if (map[charValue] > 0) {
            map[charValue] -= 1;
        } else {
            count++;
        }
    }
    return count;
}
