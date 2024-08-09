package passwordStates

import State

class CapitalClosingSpecial : State {
    override fun consume(character: String) = when(character){
        in "(!@#$%&*)" -> this
        else -> Valid()
    }
}