cmake_minimum_required(VERSION 3.30.3)

project(java-labs-seigtm LANGUAGES Java)

find_package(Java 22.0.2 REQUIRED COMPONENTS Development)
include(UseJava)

file(GLOB_RECURSE java_sources_strategy "${CMAKE_CURRENT_SOURCE_DIR}/strategy/*.java")
add_jar(strategy
    SOURCES
        ${java_sources_strategy}
    OUTPUT_NAME
        strategy
    ENTRY_POINT
        StrategyPatternDemo
)

file(GLOB_RECURSE java_sources_annotations "${CMAKE_CURRENT_SOURCE_DIR}/annotations/*.java")
add_jar(annotations
    SOURCES
        ${java_sources_annotations}
    OUTPUT_NAME
        annotations
    ENTRY_POINT
        AnnotationsDemo
)

file(GLOB_RECURSE java_sources_stream "${CMAKE_CURRENT_SOURCE_DIR}/stream/*.java")
add_jar(stream
    SOURCES
        ${java_sources_stream}
    OUTPUT_NAME
        stream
    ENTRY_POINT
        StreamAPIExamples
)

file(GLOB_RECURSE java_sources_translator "${CMAKE_CURRENT_SOURCE_DIR}/translator/*.java")
add_jar(translator
    SOURCES
        ${java_sources_translator}
    OUTPUT_NAME
        translator
    ENTRY_POINT
        Translator
)
