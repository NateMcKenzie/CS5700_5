package passwordStates

import State

class SpecialOnly : State {
    override fun consume(digit: String) = when(digit){
        digit.uppercase() -> Valid()
        else -> this
    }
}