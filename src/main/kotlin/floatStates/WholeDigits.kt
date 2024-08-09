package floatStates

import State

class WholeDigits : State {
    override fun consume(digit: String) = when (digit) {
        in "0123456789" -> this
        "." -> Decimal()
        else -> Invalid()
    }
}