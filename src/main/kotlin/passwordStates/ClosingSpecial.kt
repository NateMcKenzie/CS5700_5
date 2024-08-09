package passwordStates

import State

class ClosingSpecial : State {
    override fun consume(character: String) = when(character){
        in "(!@#$%&*)" -> this
        character.uppercase() -> Valid()
        else -> SpecialOnly()
    }
}