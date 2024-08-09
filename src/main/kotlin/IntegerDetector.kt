import integerStates.FirstDigit
import integerStates.Valid

class IntegerDetector : Detector(FirstDigit()){
    override fun checkFinalState() = this.state is Valid
}