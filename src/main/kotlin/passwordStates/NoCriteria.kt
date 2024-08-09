package passwordStates

import State

class NoCriteria : State {
    override fun consume(digit: String) = when(digit){
        digit.uppercase() -> CapitalOnly()
        in "(!@#$%&*)" -> ClosingSpecial()
        else -> this
    }
}