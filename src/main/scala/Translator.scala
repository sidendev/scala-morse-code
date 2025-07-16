object Translator {
  def englishToMorseCode(input: String): String = {
    input.toUpperCase
      .map(MorseCode.englishToMorseCodeMap.get)
      .map {
        case Some(value) => value
        case None => "UNKNOWN" 
      }
      .mkString(" ")
  }

  def morseCodeToEnglish(input: String): String = {
    input
      .split(" / ") 
      .map { word =>
        word.split(" ").map { value =>
          MorseCode.morseCodeToEnglishMap.getOrElse(value, "UNKNOWN")
        }.mkString
      }
      .mkString(" ")
  }
}
