import passwordStates.NoCriteria
import passwordStates.Valid

class PasswordDetector : Detector(NoCriteria()){
    override fun checkFinalState() = this.state is Valid
}