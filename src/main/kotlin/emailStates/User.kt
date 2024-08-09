package emailStates

import State

class User : State{
    override fun consume(digit: String) = when(digit){
        " " -> Invalid()
        "@" -> SiteStart()
        else -> this
    }
}