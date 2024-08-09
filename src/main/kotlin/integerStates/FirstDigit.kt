package integerStates

import State

class FirstDigit : State {
    override fun consume(character: String) = when(character) {
        in "123456789" -> Valid()
        else -> Invalid()
    }
}