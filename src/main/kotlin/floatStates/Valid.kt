package floatStates

import State

class Valid : State {
    override fun consume(character: String) = when (character) {
        in "0123456789" -> this
        else -> Invalid()
    }

}
