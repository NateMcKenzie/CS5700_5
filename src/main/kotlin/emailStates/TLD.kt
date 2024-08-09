package emailStates

import State

class TLD : State{
    override fun consume(digit: String) = when(digit){
        in " @." -> Invalid()
        else -> this
    }
}