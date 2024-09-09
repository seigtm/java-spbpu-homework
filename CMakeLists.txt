cmake_minimum_required(VERSION 3.30.3)

project(java-labs-seigtm LANGUAGES Java)

find_package(Java 22.0.2 REQUIRED COMPONENTS Development)
include(UseJava)

file(GLOB_RECURSE java_sources_translator "${CMAKE_CURRENT_SOURCE_DIR}/translator/*.java")
add_jar(translator
    SOURCES
        ${java_sources_translator}
    OUTPUT_NAME
        translator
    ENTRY_POINT
        Translator
)
