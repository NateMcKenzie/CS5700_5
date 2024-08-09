class Valid : State {
    override fun consume(digit: String): State {
        if (digit in "0123456789"){
            return this
        }
        return Invalid()
    }

}
