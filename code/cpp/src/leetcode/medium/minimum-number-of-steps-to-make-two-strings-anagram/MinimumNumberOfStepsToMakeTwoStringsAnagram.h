#pragma once
#include <algorithm>
#include "string"

class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public:
        int minSteps(std::string s, std::string t);
        int minStepsSpaceEfficient(std::string s, std::string t);
};
