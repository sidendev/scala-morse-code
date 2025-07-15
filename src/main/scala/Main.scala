object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Morse Code Translator!")

    val input = InputHandler.readInput("Enter text or Morse code to translate (or type 'exit' to quit):")

    if (InputHandler.isExit(input)) {
      println("Goodbye!")
      sys.exit()
    } else if (InputHandler.isMorse(input)) {
      val result = Translator.morseCodeToEnglish(input)
      OutputHandler.printOutput("Text", result)
    } else {
      val result = Translator.englishToMorseCode(input)
      OutputHandler.printOutput("Morse Code", result)
    }
  }
}
