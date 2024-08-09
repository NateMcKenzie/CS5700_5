package floatStates

import State

class Decimal : State {
    override fun consume(character: String) = when (character) {
        in "0123456789" -> Valid()
        else -> Invalid()
    }

}