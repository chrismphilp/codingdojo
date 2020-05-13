#include "AddTwoNumbersTest.h"

TEST_F(AddTwoNumbersTest, GenerateListUsingVectorShouldReturnCorrectList) {
    ListNode* l1 = generateListUsingVector({2, 4, 3});

    ASSERT_EQ(l1->val, 2);
    ASSERT_EQ(l1->next->val, 4);
    ASSERT_EQ(l1->next->next->val, 3);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForSingleLengthListNodes) {
    // 5 + 5 = 10
    ListNode* l1 = generateListUsingVector({5});
    ListNode* l2 = generateListUsingVector({5});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 0);
    ASSERT_EQ(result->next->val, 1);
    ASSERT_EQ(getListLength(result), 2);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForShorterLengthListNodes) {
    // 5 + 55 = 60
    ListNode* l1 = generateListUsingVector({5});
    ListNode* l2 = generateListUsingVector({5, 5});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 0);
    ASSERT_EQ(result->next->val, 6);
    ASSERT_EQ(getListLength(result), 2);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForEvenLengthListNodes) {
    // 342 + 465 = 807
    ListNode* l1 = generateListUsingVector({2, 4, 3});
    ListNode* l2 = generateListUsingVector({5, 6, 4});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 7);
    ASSERT_EQ(result->next->val, 0);
    ASSERT_EQ(result->next->next->val, 8);
    ASSERT_EQ(getListLength(result), 3);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForStartingUnevenLengthListNodes) {
    // 5432 + 85 = 5517
    ListNode* l1 = generateListUsingVector({2, 3, 4, 5});
    ListNode* l2 = generateListUsingVector({5, 8});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 7);
    ASSERT_EQ(result->next->val, 1);
    ASSERT_EQ(result->next->next->val, 5);
    ASSERT_EQ(result->next->next->next->val, 5);
    ASSERT_EQ(getListLength(result), 4);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForEndingUnevenLengthListNodes) {
    // 999 + 23456 = 24455
    ListNode* l1 = generateListUsingVector({9, 9, 9});
    ListNode* l2 = generateListUsingVector({6, 5, 4, 3, 2});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 5);
    ASSERT_EQ(result->next->val, 5);
    ASSERT_EQ(result->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->next->val, 2);
    ASSERT_EQ(getListLength(result), 5);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForSingleValueAndLongListNode) {
    // 9 + 23456 = 24455
    ListNode* l1 = generateListUsingVector({9});
    ListNode* l2 = generateListUsingVector({6, 5, 4, 3, 2});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 5);
    ASSERT_EQ(result->next->val, 6);
    ASSERT_EQ(result->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->val, 3);
    ASSERT_EQ(result->next->next->next->next->val, 2);
    ASSERT_EQ(getListLength(result), 5);
}

TEST_F(AddTwoNumbersTest, ShouldReturnTheCorrectListNodeForLargeCarryoverListNodes) {
    // 999 + 99999 = 100998
    ListNode* l1 = generateListUsingVector({9, 9, 9});
    ListNode* l2 = generateListUsingVector({9, 9, 9, 9, 9});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 8);
    ASSERT_EQ(result->next->val, 9);
    ASSERT_EQ(result->next->next->val, 9);
    ASSERT_EQ(result->next->next->next->val, 0);
    ASSERT_EQ(result->next->next->next->next->val, 0);
    ASSERT_EQ(result->next->next->next->next->next->val, 1);
    ASSERT_EQ(getListLength(result), 6);
}

ListNode* AddTwoNumbersTest::generateListUsingVector(std::vector<int> array) {
    auto curr = new ListNode();
    ListNode* initialNode = curr;

    for (unsigned int i  = 0; i < array.size(); i++) {
        curr->val = array[i];

        if (i != (array.size() - 1)) {
            auto newNode = new ListNode();
            curr->next = newNode;
            curr = newNode;
        }
    }

    return initialNode;
}

int AddTwoNumbersTest::getListLength(ListNode* l) {
    int count = 0;
    while (l != nullptr) {
        l = l->next;
        count++;
    }
    return count;
}
