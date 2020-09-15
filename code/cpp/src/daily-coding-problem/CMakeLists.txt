set(DAILY_CODING_PROBLEM_SOURCES
        reverse_only_letters/ReverseOnlyLetters.cpp
        reverse_only_letters/ReverseOnlyLetters.h
        element_index_in_sorted_array/ElementIndexInSortedArray.cpp
        element_index_in_sorted_array/ElementIndexInSortedArray.h
        )

add_library(daily_coding_problem_lib STATIC
        ${DAILY_CODING_PROBLEM_SOURCES}
        )

target_include_directories(daily_coding_problem_lib PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/element_index_in_sorted_array
        ${CMAKE_CURRENT_SOURCE_DIR}/reverse_only_letters
        )
