#include "MinimumNumberOfStepsToMakeTwoStringsAnagram.h"

// TODO: Finish
int MinimumNumberOfStepsToMakeTwoStringsAnagram::minSteps(std::string s, std::string t) {
    std::sort(s.begin(), s.end());
    std::sort(t.begin(), t.end());

    int count = 0, currS = 0, currT = 0;

    while (currS < s.length()) {
        if (s[currS] != t[currT]) {
            while (currT < t.length()) {
                if (s[currS] == t[currT]) {
                    count--;
                    break;
                }
                currT++;
            }
            count++;
        }
        currS++;
        if (currT == t.length()) {
            currT = currS;
        }
    }
    return count;
}
