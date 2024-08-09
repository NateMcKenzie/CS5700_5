package binaryStates

import State

class One : State {
    override fun consume(character: String) = when (character) {
        "0" -> Zero()
        "1" -> this
        else -> Invalid()
    }
}
