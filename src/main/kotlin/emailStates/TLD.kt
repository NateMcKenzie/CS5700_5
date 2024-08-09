package emailStates

import State

class TLD : State{
    override fun consume(character: String) = when(character){
        in " @." -> Invalid()
        else -> this
    }
}