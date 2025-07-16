# Morse Code Translator (Scala CLI App)

An interactive command-line application built using **Scala 3**, which provides translation between **Text** and **Morse code**. The project has been made following functional programming principles and includes tests using **ScalaTest**.

---

## Features

### Two-Way Translation
- Supports both **Text to Morse code** and **Morse code to Text**.
- Follows Morse code spacing conventions:
    - One space between Morse characters
    - A forward slash (`/`) to indicate separate words

### Continuous CLI Interaction
- The program runs in a loop, allowing users to perform multiple translations.
- Typing `exit` terminates the application.

### Auto-detection of Input Type
- The application automatically detects whether the user has entered Morse code or Text.
- No need for manual input type selection.

### Extended Morse Code Support
- Includes support for letters, numbers, and a wide range of punctuation characters (e.g., `. , ? ! @ ( ) " : ; - _ + = /`).

### Handling of Unknown Characters
- Any unsupported or invalid characters in the input are replaced with the string `"UNKNOWN"` in the output.
- This ensures feedback to the user when an invalid input has been made.

---

## Functional Programming Principles

This project adheres to some key functional programming practices in Scala:

- Pure functions with no side effects in all translation logic
- Use of `val` over `var` to ensure immutability
- Modular and composable design using focused objects:
    - `Translator`: handles conversion logic
    - `MorseCode`: stores mappings
    - `InputHandler`: processes input
    - `OutputHandler`: formats and displays output
    - `Main`: runs the application

---

## Testing with ScalaTest

Unit tests are written using **ScalaTest** and the `AnyFunSuite` testing suite.

Tests include:

- Text to Morse translation
- Morse to Text translation
- Sentence translation with punctuation
- Correct use of `/` for word separation
- Handling of unknown characters

All test cases are located in:
TranslatorSpec file 

