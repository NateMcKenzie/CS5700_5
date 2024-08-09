import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EmailDetectorTest {
    private val detector = EmailDetector()

    @Test
    fun simpleTest() = assertTrue(detector.detect("a@b.c"))

    @Test
    fun normalTest() = assertTrue(detector.detect("joseph.ditton@usu.edu"))

    @Test
    fun charactersTest() = assertTrue(detector.detect("{}*$.&$*(@*$%&.*&*"))

    @Test
    fun noUserTest() = assertFalse(detector.detect("@b.c"))

    @Test
    fun manyAtTest() = assertFalse(detector.detect("a@b@c.com"))

    @Test
    fun manyPeriodTest() = assertFalse(detector.detect("a.b@b.b.c"))

    @Test
    fun spaceTest() = assertFalse(detector.detect("joseph ditton@usu.edu"))

    @Test
    fun invalidSiteStartTest() = assertFalse(detector.detect("spiderman@ usu.edu"))

    @Test
    fun invalidTLDTest() = assertFalse(detector.detect("spiderman@usu.ed@u"))

    @Test
    fun invalidTLDStartTest() = assertFalse(detector.detect("spiderman@usu.@edu"))
}