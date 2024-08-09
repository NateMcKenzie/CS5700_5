package floatStates

import State

class Invalid : State {
    override fun consume(digit: String) = this
}
