package passwordStates

import State

class NoCriteria : State {
    override fun consume(character: String) = when(character){
        in "(!@#$%&*)" -> ClosingSpecial()
        character.uppercase() -> CapitalOnly()
        else -> this
    }
}