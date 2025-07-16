object InputHandler {
  def readInput(prompt: String): String = {
    println(prompt)
    scala.io.StdIn.readLine()
  }

  def isExit(input: String): Boolean =
    input.trim.toLowerCase == "exit"

  def isMorse(input: String): Boolean =
    input.trim.forall(c => c == '.' || c == '-' || c == '/' || c == ' ')
}
