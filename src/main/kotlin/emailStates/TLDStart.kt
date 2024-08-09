package emailStates

import State

class TLDStart : State{
    override fun consume(digit: String) = when(digit){
        in " @." -> Invalid()
        else -> TLD()
    }
}