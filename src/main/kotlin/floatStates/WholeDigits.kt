package floatStates

import State

class WholeDigits : State {
    override fun consume(character: String) = when (character) {
        in "0123456789" -> this
        "." -> Decimal()
        else -> Invalid()
    }
}