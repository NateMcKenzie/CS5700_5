package emailStates

import State

class UserStart : State{
    override fun consume(digit: String) = when(digit){
        in " @" -> Invalid()
        else -> User()
    }
}