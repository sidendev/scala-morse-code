# Scala Morse Code Translator (Scala CLI App)

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
`src/test/scala/TranslatorSpec.scala`

---

## Running the Application Locally

### Clone GitHub repository to local environment:

1. Open your terminal.
2. Navigate to the directory where you want the project to be saved.
3. Enter: git clone https://github.com/sidendev/scala-morse-code.git

### Running app with IntelliJ IDEA (Recommended):

1. Open IntelliJ and select **Open**.
2. Navigate to the project root directory and open it.
3. Ensure the **Scala plugin** is installed.
4. Open CLI terminal if not already open.
5. Open `Main.scala` and click the green **Run** button beside the `main` method.
6. Follow prompts and commands within the CLI.

---

## Example of CLI session

```Welcome to the Morse Code Translator!
Enter text or Morse code to translate (or type 'exit' to quit):
Hello world!

Morse Code: .... . .-.. .-.. --- / .-- --- .-. .-.. -.. -.-.--

Enter text or Morse code to translate (or type 'exit' to quit):
.... . .-.. .-.. --- / .-- --- .-. .-.. -.. -.-.--
Text: HELLO WORLD!

Enter text or Morse code to translate (or type 'exit' to quit):
exit
Goodbye!
```

