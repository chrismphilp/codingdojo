add_executable(CodingDojo
        main.cpp
        )

target_link_libraries(CodingDojo
        daily_coding_problem_lib
        leetcode_lib
        )

add_subdirectory(daily-coding-problem)
add_subdirectory(leetcode)