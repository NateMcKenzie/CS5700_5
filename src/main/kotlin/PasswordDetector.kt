import passwordStates.NoCriteria
import passwordStates.Valid

class PasswordDetector : Detector(NoCriteria()){
    override fun checkFinalState() = this.state is Valid

    override fun preValidate(input: String) = input.length >= 8
}