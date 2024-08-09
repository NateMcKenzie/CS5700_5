import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FloatDetectorTest {
    private val detector = FloatDetector()

    @Test
    fun goodExampleSimpleTest() = assertTrue(detector.detect("1.0"))

    @Test
    fun goodExampleTest() = assertTrue(detector.detect("123.34"))

    @Test
    fun leadingZeroTest() = assertTrue(detector.detect("0.20000"))

    @Test
    fun bigTest() = assertTrue(detector.detect("12349871234.12340981234098"))

    @Test
    fun leadingDecimalTest() = assertTrue(detector.detect(".123"))

    @Test
    fun noDecimalTest() = assertFalse(detector.detect("123"))

    @Test
    fun twoDecimalTest() = assertFalse(detector.detect("123.123."))

    @Test
    fun alphaTest() = assertFalse(detector.detect("123.02a"))

    @Test
    fun closingDecimalTest() = assertFalse(detector.detect("123."))

    @Test
    fun leadingZeroInvalidTest() = assertFalse(detector.detect("012.4"))

    @Test
    fun invalidStartTest() = assertFalse(detector.detect("a12.4"))

    @Test
    fun invalidWholeTest() = assertFalse(detector.detect("1a2.4"))

    @Test
    fun invalidDecimalTest() = assertFalse(detector.detect("12.a4"))
}