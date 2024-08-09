package binaryStates

import State

class Zero : State {
    override fun consume(character: String) = when (character) {
        "0" -> this
        "1" -> One()
        else -> Invalid()
    }
}
