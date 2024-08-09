fun main() {
    val detectors = arrayOf(IntegerDetector())
    var running = true
    while (running){
        print("""
            What detector?
            
            0) Integer
            1) Float
            2) Binary
            3) Email
            4) Password
            
        """.trimIndent())
        val index = readln().toInt()
        println("Enter String:")
        val input = readln()
        val response = detectors[index].detect(input)
        println(if (response) "Valid" else "Invalid")
    }
}