#pragma once

#include "gtest/gtest.h"
#include "gmock/gmock.h"
#include <array>
#include "AddTwoNumbers.h"

using testing::Test;

class AddTwoNumbersTest : public Test {
    public:
        AddTwoNumbers addTwoNumbers;
        ListNode* generateListUsingVector(std::vector<int> array);
        int getListLength(ListNode* l);
};