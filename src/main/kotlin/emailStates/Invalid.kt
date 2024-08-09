package emailStates

import State

class Invalid : State{
    override fun consume(digit: String) = this
}