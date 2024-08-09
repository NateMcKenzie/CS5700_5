fun main() {
    val detectors = arrayOf(IntegerDetector(), FloatDetector(), BinaryDetector(), EmailDetector())

    while (true){
        print("""
            What detector?
            =========================
                0) Integer
                1) Float
                2) Binary
                3) Email
                4) Password
                5) Quit
            =========================
            
        """.trimIndent())
        val index = readln().toInt()
        if(index == 5) break

        println("Enter String:")
        val input = readln()

        val response = detectors[index].detect(input)

        println(if (response) "Valid" else "Invalid")
    }
}