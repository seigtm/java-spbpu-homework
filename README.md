# Java Practical Assignments

## Overview

This repository contains a series of practical programming tasks designed to demonstrate proficiency with various programming concepts, patterns, and methodologies.

## Getting Started

To get started with this repository, clone it to your local machine:

```bash
git clone https://github.com/spbstu-java/labs-seigtm.git
```

### Prerequisites

- [Java Development Kit (JDK)](https://jdk.java.net/22/).
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.

### Running the Application

1. Compile the source code using your IDE or a command-line tool.
2. Run the individual tasks or the course project application.

## Tasks

### 1. [Hero Movement Strategy](https://github.com/spbstu-java/labs-seigtm/tree/main/strategy)

In this task, a hero (represented by the `Hero` class) can move between two points using different methods: walking, riding a horse, flying, etc. The goal is to implement classes that allow the user to select and change the hero's movement method during program execution, utilizing the ["Strategy" design pattern](https://en.wikipedia.org/wiki/Strategy_pattern). The implementation should include a demonstration of how these classes work together.

### 2. [Annotated Methods](https://github.com/spbstu-java/labs-seigtm/tree/main/annotations)

Create a custom annotation with an integer parameter. Develop a class that contains public, protected, and private methods (2–3 of each kind) with parameters, and annotate some of them. From another class, invoke all annotated protected and private methods the number of times specified in the annotation parameter. The code that invokes these methods should not depend on the number or types of their parameters.

### 3. [Translator Program](https://github.com/spbstu-java/labs-seigtm/tree/main/translator)

Develop a translation program that works as follows:

1. On startup, the program reads a dictionary from a file formatted as:

   ```text
   word or phrase | translation
   ```

2. The program then prompts the user for input via the console and translates the entered text according to the following rules:
    - Case-insensitive matching.
    - If the word is not found in the dictionary, it is output as-is.
    - If multiple matches are found, the longest matching phrase (before the `|` delimiter) is chosen. For example:
        - Dictionary:

        ```text
        look | смотреть
        look forward | ожидать
        ```

        - Text:

        ```text
        dog look to the window, dog look forward
        ```

        - Translation:

        ```text
        dog смотреть to the window, dog ожидать
        ```

3. The translation result is printed to the console.
4. Implement and use custom exceptions for error handling:
    - `InvalidFileFormatException` for issues related to the dictionary file format.
    - `FileReadException` for cases where the file does not exist or cannot be accessed.

### 4. [Stream API Exercises](https://github.com/spbstu-java/labs-seigtm/tree/main/stream)

Implement the following methods using only Java's Stream API:

- A method that returns the average value of a list of integers.
- A method that converts all strings in a list to uppercase and prepends them with the prefix "_new_".
- A method that returns a list of squares of all elements in a list that appear only once.
- A method that returns the last element of a collection or throws an exception if the collection is empty.
- A method that takes an array of integers and returns the sum of even numbers, or 0 if there are no even numbers.
- A method that converts all strings in a list to a `Map`, where the first character is the key and the remaining characters are the value.

## License

This project is licensed under the **MIT License** - see the [`LICENSE`](https://github.com/spbstu-java/labs-seigtm/tree/main/LICENSE) file for details.

## Acknowledgments

This project is inspired by practical programming exercises to deepen understanding of core Java concepts and design patterns.
