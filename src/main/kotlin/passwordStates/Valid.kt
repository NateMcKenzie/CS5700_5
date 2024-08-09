package passwordStates

import State

class Valid : State {
    override fun consume(digit: String) = this
}