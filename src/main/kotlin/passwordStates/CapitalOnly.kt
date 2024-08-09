package passwordStates

import State

class CapitalOnly : State {
    override fun consume(character: String) = when(character){
        in "(!@#$%&*)" -> CapitalClosingSpecial()
        else -> this
    }
}