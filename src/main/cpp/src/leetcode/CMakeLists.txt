set(LEETCODE_SOURCES
        two-sum/TwoSum.cpp two-sum/TwoSum.h
        add-two-numbers/AddTwoNumbersTest.cpp add-two-numbers/AddTwoNumbers.h)

add_library(leetcode_lib STATIC
        ${LEETCODE_SOURCES}
        )

target_include_directories(leetcode_lib PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/two-sum
        ${CMAKE_CURRENT_SOURCE_DIR}/add-two-numbers
        )
