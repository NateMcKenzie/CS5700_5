package passwordStates

import State

class NoCriteria : State {
    override fun consume(digit: String) = when(digit){
        in "(!@#$%&*)" -> ClosingSpecial()
        digit.uppercase() -> CapitalOnly()
        else -> this
    }
}