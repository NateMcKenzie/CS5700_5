package floatStates

import State

class Decimal : State {
    override fun consume(digit: String) = when (digit) {
        in "0123456789" -> Valid()
        else -> Invalid()
    }

}