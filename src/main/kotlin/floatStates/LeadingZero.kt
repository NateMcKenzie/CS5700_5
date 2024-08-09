package floatStates

import State

class LeadingZero : State {
    override fun consume(character: String) = when (character) {
        "." -> Decimal()
        else -> Invalid()
    }

}