package emailStates

import State

class SiteStart : State{
    override fun consume(digit: String) = when(digit){
        in " @." -> Invalid()
        else -> Site()
    }
}