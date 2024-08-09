import binaryStates.FirstDigit
import binaryStates.One

class BinaryDetector : Detector(FirstDigit()) {
    override fun checkFinalState() = state is One
}