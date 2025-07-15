import org.scalatest.funsuite.AnyFunSuite

class TranslatorSpec extends AnyFunSuite {

  test("englishToMorseCode should translate a word to morse code") {
    val result = Translator.englishToMorseCode("Hello")
    assert(result == ".... . .-.. .-.. ---")
  }

  test("morseCodeToEnglish should translate simple morse") {
    val result = Translator.morseCodeToEnglish(".... . .-.. .-.. ---")
    assert(result == "HELLO")
  }

  test("englishToMorseCode should handle unknown characters") {
    val result = Translator.englishToMorseCode("HELLO#")
    assert(result.contains("UNKNOWN"))
  }

  test("morseCodeToEnglish should handle unknown morse code") {
    val result = Translator.morseCodeToEnglish(".... . .-.. .-.. --- / ........")
    assert(result.contains("UNKNOWN"))
  }

  test("englishToMorseCode should translate a full sentence with punctuation") {
    val result = Translator.englishToMorseCode("Hello there!")
    assert(result == ".... . .-.. .-.. --- / - .... . .-. . -.-.--")
  }

  test("morseCodeToEnglish should convert / to space between words") {
    val result = Translator.morseCodeToEnglish(".... . .-.. .-.. --- / - .... . .-. . -.-.--")
    assert(result == "HELLO THERE!")
  }

  test("englishToMorseCode should insert / between words") {
    val result = Translator.englishToMorseCode("Scala is fun")
    assert(result.contains("/"))
    assert(result == "... -.-. .- .-.. .- / .. ... / ..-. ..- -.")
  }

  test("englishToMorseCode should return UNKNOWN for only one unsupported character") {
    val result = Translator.englishToMorseCode("#")
    assert(result == "UNKNOWN")
  }

  test("englishToMorseCode should return multiple UNKNOWNs for unsupported characters") {
    val result = Translator.englishToMorseCode("#%&")
    assert(result == "UNKNOWN UNKNOWN UNKNOWN")
  }

}
