package integerStates

import State

class FirstDigit : State {
    override fun consume(digit: String) = when(digit) {
        in "123456789" -> Valid()
        else -> Invalid()
    }
}