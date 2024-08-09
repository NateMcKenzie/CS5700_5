import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntegerDetectorTest {
    private val detector = IntegerDetector()

    @Test
    fun zeroStartTest() =
        assertFalse(detector.detect("012312"))

    @Test
    fun extraCharactersTest() =
        assertFalse(detector.detect("1a2312"))

    @Test
    fun emptryStringTest() =
        assertFalse(detector.detect(""))

    @Test
    fun goodExampleOneTest() =
        assertTrue(detector.detect("1"))

    @Test
    fun goodExampleOneTwoThreeTest() =
        assertTrue(detector.detect("123"))

    @Test
    fun goodExampleLongTest() =
        assertTrue(detector.detect("3452342352434534524346"))

}