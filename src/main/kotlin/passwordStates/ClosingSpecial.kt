package passwordStates

import State

class ClosingSpecial : State {
    override fun consume(digit: String) = when(digit){
        in "(!@#$%&*)" -> this
        digit.uppercase() -> Valid()
        else -> SpecialOnly()
    }
}