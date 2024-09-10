cmake_minimum_required(VERSION 3.30.3)

project(java-labs-seigtm LANGUAGES Java)

find_package(Java 22.0.2 REQUIRED COMPONENTS Development)
include(UseJava)

file(GLOB_RECURSE java_sources_stream "${CMAKE_CURRENT_SOURCE_DIR}/stream/*.java")
add_jar(stream
    SOURCES
        ${java_sources_stream}
    OUTPUT_NAME
        stream
    ENTRY_POINT
        StreamAPIExamples
)
