package floatStates

import State

class FirstDigit : State {
    override fun consume(digit: String) =
        when (digit) {
            in "123456789" -> WholeDigits()
            "." -> Decimal()
            "0" -> ZeroFirst()
            else -> Invalid()
        }
}