package com.example.faoadmin

import android.content.Context

class AnalysisManager(context: Context) {

    private val historyStore = HistoryStore(context)

    fun addMultiplier(value: Double): AnalysisEngine.Result? {
        historyStore.addMultiplier(value)

        return AnalysisEngine.analyze(
            historyStore.getHistory()
        )
    }

    fun getHistoryCount(): Int {
        return historyStore.count()
    }

    fun getCurrentResult(): AnalysisEngine.Result? {
        return AnalysisEngine.analyze(
            historyStore.getHistory()
        )
    }
}
