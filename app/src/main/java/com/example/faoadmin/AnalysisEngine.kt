package com.example.faoadmin

import kotlin.math.sqrt

object AnalysisEngine {

    data class Result(
        val low: Double,
        val high: Double,
        val sampleSize: Int
    )

    fun analyze(history: List<Double>): Result? {
        val values = history.filter { it > 0.0 }

        if (values.size < 20) return null

        val mean = values.average()

        val variance = values
            .map { (it - mean) * (it - mean) }
            .average()

        val standardDeviation = sqrt(variance)

        val low = (mean - standardDeviation).coerceAtLeast(1.00)
        val high = mean + standardDeviation

        return Result(
            low = low,
            high = high,
            sampleSize = values.size
        )
    }
}
