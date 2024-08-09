package emailStates

import State

class UserStart : State{
    override fun consume(character: String) = when(character){
        in " @" -> Invalid()
        else -> User()
    }
}