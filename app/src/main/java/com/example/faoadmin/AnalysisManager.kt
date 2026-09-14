private val history = mutableListOf<Double>()

fun addMultiplier(value: Double): AnalysisEngine.Result? {
    history.add(value)
    return AnalysisEngine.analyze(history)
}

fun getHistoryCount(): Int {
    return history.size
}

fun getCurrentResult(): AnalysisEngine.Result? {
    return AnalysisEngine.analyze(history)
}
