#include "AddTwoNumbers.h"

// Run one list against the other, length is not important, stop when the list ends, or there is no carry-over
ListNode* AddTwoNumbers::addTwoNumbers(ListNode* l1, ListNode* l2) {
    ListNode* beginningNode = l2;
    int carryOver = 0;
    int total;

    while (l1 != nullptr) {

        total = l1->val + l2->val + carryOver;

        if (total >= 10) {
            l2->val = total - 10;
            carryOver = 1;
        } else {
            l2->val = total;
            carryOver = 0;
        }

        l1 = l1->next;

        if ((l1 != nullptr && l2->next == nullptr) || (carryOver == 1 && l2->next == nullptr)) {
            l2->next = new ListNode();
        }
        l2 = l2->next;

    }

    while (carryOver == 1) {

        total = l2->val + carryOver;

        if (total >= 10) {
            l2->val = total - 10;
            carryOver = 1;
        } else {
            l2->val = total;
            carryOver = 0;
        }

        if (l2->next == nullptr && carryOver == 1) {
            l2->next = new ListNode();
        }
        l2 = l2->next;
    }

    return beginningNode;
}
