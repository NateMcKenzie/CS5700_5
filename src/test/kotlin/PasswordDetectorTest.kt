import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PasswordDetectorTest {
    private val detector = PasswordDetector()

    @Test
    fun valid1Test() = assertTrue(detector.detect("aaaaH!aa"))

    @Test
    fun valid2Test() = assertTrue(detector.detect("1234567*9J"))

    @Test
    fun valid3Test() = assertTrue(detector.detect("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))

    @Test
    fun closingSpecialCapitalTest() = assertTrue(detector.detect("bbbbbbb!A"))

    @Test
    fun OpeningSpecialTest() = assertTrue(detector.detect("@abbbbbbB"))

    @Test
    fun shortTest() = assertFalse(detector.detect("A!!A"))

    @Test
    fun noCriteriaTest() = assertFalse(detector.detect("a"))

    @Test
    fun noCapitalTest() = assertFalse(detector.detect("aaaaaaa!"))

    @Test
    fun noSpecialTest() = assertFalse(detector.detect("aaaHaaaaa"))

    @Test
    fun closingSpecialEscapeTest() = assertFalse(detector.detect("bbbbbbb!a"))

    @Test
    fun closingSpecialTest() = assertFalse(detector.detect("bbbbbbb!@@"))

    @Test
    fun capitalClosingSpecialTest() = assertFalse(detector.detect("abbbbbbB!@!"))
}