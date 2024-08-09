package emailStates

import State

class SiteStart : State{
    override fun consume(character: String) = when(character){
        in " @." -> Invalid()
        else -> Site()
    }
}