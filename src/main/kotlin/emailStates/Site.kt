package emailStates

import State

class Site : State{
    override fun consume(digit: String) = when(digit){
        in " @" -> Invalid()
        "." -> TLDStart()
        else -> this
    }
}