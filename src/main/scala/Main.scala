object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Morse Code Translator!")

    val input = InputHandler.readInput()
    val morseCode = Translator.englishToMorseCode(input)
    OutputHandler.printOutput(morseCode)
  }
}
