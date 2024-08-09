package floatStates

import State

class ZeroFirst : State {
    override fun consume(character: String) = when (character) {
        "." -> Decimal()
        else -> Invalid()
    }

}