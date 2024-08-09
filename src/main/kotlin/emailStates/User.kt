package emailStates

import State

class User : State{
    override fun consume(character: String) = when(character){
        " " -> Invalid()
        "@" -> SiteStart()
        else -> this
    }
}