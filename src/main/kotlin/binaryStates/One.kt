package binaryStates

import State

class One : State {
    override fun consume(digit: String) = when (digit) {
        "0" -> Zero()
        "1" -> this
        else -> Invalid()
    }
}
