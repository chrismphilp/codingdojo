#include <iostream>
#include "daily-coding-problem/reverse_only_letters/ReverseOnlyLetters.h"
#include "daily-coding-problem/element_index_in_sorted_array/ElementIndexInSortedArray.h"

int main() {
    std::cout << "Hello, World!" << std::endl;
    ReverseOnlyLetters reverseOnlyLetters;
    ElementIndexInSortedArray elementIndexInSortedArray;
    std::vector<int> array = { 5, 15, 25 };
    std::cout << elementIndexInSortedArray.findIndex(array, 15) << std::endl;
    return 0;
}