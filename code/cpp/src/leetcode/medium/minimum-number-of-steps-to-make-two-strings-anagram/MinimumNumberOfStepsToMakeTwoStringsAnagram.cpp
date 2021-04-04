#include "MinimumNumberOfStepsToMakeTwoStringsAnagram.h"

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

int MinimumNumberOfStepsToMakeTwoStringsAnagram::minStepsSpaceEfficient(std::string s, std::string t) {

    int count = 0;
    int i = 0;
    int j = 0;

    sort(s.begin(), s.end());
    sort(t.begin(), t.end());

    while (i < s.length() && j < t.length()) {
        if (s[i] == t[j]) {
            i++;
            j++;
        }
            // s[i] is before t[j] in the alphabet
        else if (s[i] - 97 < t[j] - 97) {
            i++;
            count++;
        }
            // s[i] is after t[j] in the alphabet
        else {
            j++;
        }
    }
    return count + (s.length() - i);
}

