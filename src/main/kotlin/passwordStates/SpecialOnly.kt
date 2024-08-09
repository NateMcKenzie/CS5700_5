package passwordStates

import State

class SpecialOnly : State {
    override fun consume(character: String) = when(character){
        character.uppercase() -> Valid()
        else -> this
    }
}