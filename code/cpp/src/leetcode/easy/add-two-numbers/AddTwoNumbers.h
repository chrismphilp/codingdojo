#pragma once

struct ListNode {
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
};

class AddTwoNumbers {
    public:
        ListNode* addTwoNumbers(ListNode* l1, ListNode* l2);
};
