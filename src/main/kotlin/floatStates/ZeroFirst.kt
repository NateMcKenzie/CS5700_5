package floatStates

import State

class ZeroFirst : State {
    override fun consume(digit: String) = when (digit) {
        "." -> Decimal()
        else -> Invalid()
    }

}