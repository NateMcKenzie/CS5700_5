package binaryStates

import State

class Zero : State {
    override fun consume(digit: String) = when (digit) {
        "0" -> this
        "1" -> One()
        else -> Invalid()
    }
}
