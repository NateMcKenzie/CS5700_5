package passwordStates

import State

class CapitalClosingSpecial : State {
    override fun consume(digit: String) = when(digit){
        in "(!@#$%&*)" -> this
        else -> Valid()
    }
}