package floatStates

import State

class FirstDigit : State {
    override fun consume(character: String) =
        when (character) {
            in "123456789" -> WholeDigits()
            "." -> Decimal()
            "0" -> ZeroFirst()
            else -> Invalid()
        }
}