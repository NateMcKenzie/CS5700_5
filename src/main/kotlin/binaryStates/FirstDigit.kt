package binaryStates

import State

class FirstDigit : State {
    override fun consume(digit: String) = when (digit) {
        "1" -> One()
        else -> Invalid()
    }
}