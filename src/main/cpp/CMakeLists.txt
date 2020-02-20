cmake_minimum_required(VERSION 3.14)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

include_directories(
        reverse_only_letters
        element_index_in_sorted_array
)

add_executable(
        cpp main.cpp
        reverse_only_letters/ReverseOnlyLetters.cpp reverse_only_letters/ReverseOnlyLetters.h
        element_index_in_sorted_array/ElementIndexInSortedArray.cpp element_index_in_sorted_array/ElementIndexInSortedArray.h)