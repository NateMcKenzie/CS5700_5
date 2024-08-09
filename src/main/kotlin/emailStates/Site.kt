package emailStates

import State

class Site : State{
    override fun consume(character: String) = when(character){
        in " @" -> Invalid()
        "." -> TLDStart()
        else -> this
    }
}