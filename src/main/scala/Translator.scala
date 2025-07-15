object Translator {
  def englishToMorseCode(input: String): String = {
    input.toUpperCase
      .map(MorseCode.englishToMorseCodeMap.get)
      .map {
        case Some(value) => value
        case None => "UNKNOWN" // handling unsupported characters
      }
      .mkString(" ")
  }

  def morseCodeToEnglish(input: String): String = {
    input
      .split(" / ") // split up morse code where / exists
      .map { word =>
        word.split(" ").map { value =>
          MorseCode.morseCodeToEnglishMap.getOrElse(value, "UNKNOWN")
        }.mkString
      }
      .mkString(" ")
  }
}
