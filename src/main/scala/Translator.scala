object Translator {
  def englishToMorseCode(input: String): String = {
    input.toUpperCase
      .map(MorseCode.morseCodeMap.get)
      .map {
        case Some(morsecode) => morsecode
        case None => "UNKNOWN" // handling unsupported characters
      }
      .mkString(" ")
  }
}
