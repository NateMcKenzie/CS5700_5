package passwordStates

import State

class Valid : State {
    override fun consume(character: String) = this
}