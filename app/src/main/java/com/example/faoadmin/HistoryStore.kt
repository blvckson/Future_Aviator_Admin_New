package com.example.faoadmin

data class AnalysisResult(
val timestamp: Long,
val prediction: String,
val confidence: Double
)
