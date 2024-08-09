package emailStates

import State

class Invalid : State{
    override fun consume(character: String) = this
}