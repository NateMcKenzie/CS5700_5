import emailStates.TLD
import emailStates.UserStart

class EmailDetector : Detector(UserStart()) {
    override fun checkFinalState() = state is TLD
}