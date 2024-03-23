cmake_minimum_required(VERSION 3.27)
project(cpp)

include_directories(/usr/local/boost_1_82_0)

set(CMAKE_CXX_STANDARD 20)

add_executable(cpp main.cpp)
add_executable(trajectory1 trajectory1.cpp)
add_executable(trajectory2a trajectory2a.cpp)