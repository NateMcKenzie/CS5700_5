package floatStates

import State

class Valid : State {
    override fun consume(digit: String) = when (digit) {
        in "0123456789" -> this
        else -> Invalid()
    }

}
