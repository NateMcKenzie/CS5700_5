package binaryStates

import State

class Invalid : State {
    override fun consume(character: String) = this
}
