cmake_minimum_required(VERSION 2.8.9)

project (my-application)

add_executable(
    my-application
    
    my-application.c
    secrets.c
)

install(
    TARGETS
        my-application
    DESTINATION
        bin
)
