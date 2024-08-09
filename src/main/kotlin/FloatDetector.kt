import floatStates.FirstDigit
import floatStates.Valid

class FloatDetector : Detector(FirstDigit()) {
    override fun checkFinalState() = state is Valid
}