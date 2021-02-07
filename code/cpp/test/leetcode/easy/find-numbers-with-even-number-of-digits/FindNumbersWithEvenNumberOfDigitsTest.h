#pragma once

#include "gtest/gtest.h"
#include "gmock/gmock.h"
#include <chrono>
#include <vector>
#include "FindNumbersWithEvenNumberOfDigits.h"

using testing::Test;

class FindNumbersWithEvenNumberOfDigitsTest : public Test {
    public:
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits;
};
