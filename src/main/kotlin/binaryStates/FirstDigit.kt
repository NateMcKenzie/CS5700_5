package binaryStates

import State

class FirstDigit : State {
    override fun consume(character: String) = when (character) {
        "1" -> One()
        else -> Invalid()
    }
}