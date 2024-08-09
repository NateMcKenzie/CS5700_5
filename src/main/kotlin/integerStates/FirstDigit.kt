class FirstDigit : State {
    override fun consume(digit: String): State {
        if(digit in "123456789"){
            return Valid()
        }
        return Invalid()
    }

}