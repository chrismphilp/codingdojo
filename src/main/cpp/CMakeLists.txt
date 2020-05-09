cmake_minimum_required(VERSION 3.14)
project(CodingDojo)
set(CMAKE_CXX_STANDARD 17)

add_executable(CodingDojo
        src/main.cpp
)

enable_testing()

add_subdirectory(src)
add_subdirectory(test)
