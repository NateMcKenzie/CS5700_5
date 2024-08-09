package binaryStates

import State

class Invalid : State {
    override fun consume(digit: String) = this
}
