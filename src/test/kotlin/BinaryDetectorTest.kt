import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryDetectorTest {
    private val detector = BinaryDetector()

    @Test
    fun oneTest() = assertTrue(detector.detect("1"))

    @Test
    fun twoOneTest() = assertTrue(detector.detect("11"))

    @Test
    fun sandwichTest() = assertTrue(detector.detect("101"))

    @Test
    fun allOneTest() = assertTrue(detector.detect("111111"))

    @Test
    fun complexTest() = assertTrue(detector.detect("10011010001"))

    @Test
    fun leadingZeroTest() = assertFalse(detector.detect("01"))

    @Test
    fun closingZeroTest() = assertFalse(detector.detect("10"))

    @Test
    fun closingZeroBigTest() = assertFalse(detector.detect("1000010"))

    @Test
    fun zeroAlphaTest() = assertFalse(detector.detect("100a01"))

    @Test
    fun oneAlphaTest() = assertFalse(detector.detect("101a01"))
}