package emailStates

import State

class TLDStart : State{
    override fun consume(character: String) = when(character){
        in " @." -> Invalid()
        else -> TLD()
    }
}