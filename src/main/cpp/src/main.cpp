#include <iostream>
#include "ReverseOnlyLetters.h"
#include "ElementIndexInSortedArray.h"

int main() {
    std::cout << "Hello, World!" << std::endl;
    ReverseOnlyLetters reverseOnlyLetters;
    ElementIndexInSortedArray elementIndexInSortedArray;
    std::vector<int> array = { 5, 15, 25 };
    std::cout << elementIndexInSortedArray.findIndex(array, 15) << std::endl;
    return 0;
}