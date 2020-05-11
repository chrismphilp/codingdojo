#include "AddTwoNumbersTest.h"

TEST(AddTwoNumbers, GenerateListUsingVectorShouldReturnCorrectList) {
    AddTwoNumbersTest addTwoNumbersTest;

    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({2, 4, 3});

    ASSERT_EQ(l1->val, 2);
    ASSERT_EQ(l1->next->val, 4);
    ASSERT_EQ(l1->next->next->val, 3);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForSingleLengthListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 5 + 5 = 10
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({5});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({5});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 0);
    ASSERT_EQ(result->next->val, 1);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 2);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForShorterLengthListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 5 + 55 = 60
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({5});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({5, 5});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 0);
    ASSERT_EQ(result->next->val, 6);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 2);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForEvenLengthListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 342 + 465 = 807
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({2, 4, 3});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({5, 6, 4});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 7);
    ASSERT_EQ(result->next->val, 0);
    ASSERT_EQ(result->next->next->val, 8);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 3);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForStartingUnevenLengthListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 5432 + 85 = 5517
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({2, 3, 4, 5});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({5, 8});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 7);
    ASSERT_EQ(result->next->val, 1);
    ASSERT_EQ(result->next->next->val, 5);
    ASSERT_EQ(result->next->next->next->val, 5);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 4);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForEndingUnevenLengthListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 999 + 23456 = 24455
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({9, 9, 9});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({6, 5, 4, 3, 2});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 5);
    ASSERT_EQ(result->next->val, 5);
    ASSERT_EQ(result->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->next->val, 2);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 5);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForSingleValueAndLongListNode) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 9 + 23456 = 24455
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({9});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({6, 5, 4, 3, 2});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 5);
    ASSERT_EQ(result->next->val, 6);
    ASSERT_EQ(result->next->next->val, 4);
    ASSERT_EQ(result->next->next->next->val, 3);
    ASSERT_EQ(result->next->next->next->next->val, 2);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 5);
}

TEST(AddTwoNumbers, ShouldReturnTheCorrectListNodeForLargeCarryoverListNodes) {
    AddTwoNumbers addTwoNumbers;
    AddTwoNumbersTest addTwoNumbersTest;

    // 999 + 99999 = 100998
    ListNode* l1 = addTwoNumbersTest.generateListUsingVector({9, 9, 9});
    ListNode* l2 = addTwoNumbersTest.generateListUsingVector({9, 9, 9, 9, 9});
    ListNode* result = addTwoNumbers.addTwoNumbers(l1, l2);

    ASSERT_EQ(result->val, 8);
    ASSERT_EQ(result->next->val, 9);
    ASSERT_EQ(result->next->next->val, 9);
    ASSERT_EQ(result->next->next->next->val, 0);
    ASSERT_EQ(result->next->next->next->next->val, 0);
    ASSERT_EQ(addTwoNumbersTest.getListLength(result), 6);
}

ListNode* AddTwoNumbersTest::generateListUsingVector(std::vector<int> array) {
    auto curr = new ListNode();
    ListNode* initialNode = curr;

    for (int i  = 0; i < array.size(); i++) {
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
