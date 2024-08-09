package passwordStates

import State

class CapitalOnly : State {
    override fun consume(digit: String) = when(digit){
        in "(!@#$%&*)" -> CapitalClosingSpecial()
        else -> this
    }
}