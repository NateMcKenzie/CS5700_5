abstract class Detector(private val initialState: State){
    protected var state = initialState

    fun detect(input: String): Boolean {
        if (preValidate(input)){
            val splits = splitString(input)
            iterate(splits)
            val valid = checkFinalState()
            resetState()
            return valid
        }
        resetState()
        return false
    }

    open fun preValidate(input: String) = true

    protected abstract fun checkFinalState() : Boolean

    private fun splitString(input: String): List<String>{
        val list = mutableListOf<String>()
        input.forEach {
            list.add(it.toString())
        }
        return list
    }

    private fun iterate(input: List<String>){
        input.forEach{
            state = state.consume(it)
        }
    }

    private fun resetState() {
        state = initialState
    }
}