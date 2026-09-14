data class Result(
    val prediction: Double,
    val confidence: Double
)

fun analyze(history: List<Double>): Result? {
    if (history.isEmpty()) {
        return null
    }

    val average = history.average()

    return Result(
        prediction = average,
        confidence = 0.5
    )
}
