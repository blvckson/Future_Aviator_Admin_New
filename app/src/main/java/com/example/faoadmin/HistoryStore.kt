package com.example.faoadmin

import android.content.Context
import org.json.JSONArray

class HistoryStore(context: Context) {

    private val preferences =
        context.getSharedPreferences("aviator_history", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_HISTORY = "multipliers"
    }

    fun addMultiplier(value: Double) {
        if (value <= 0.0) return

        val history = getHistory().toMutableList()
        history.add(value)

        val json = JSONArray()
        history.forEach { json.put(it) }

        preferences.edit()
            .putString(KEY_HISTORY, json.toString())
            .apply()
    }

    fun getHistory(): List<Double> {
        val stored = preferences.getString(KEY_HISTORY, null)
            ?: return emptyList()

        return try {
            val json = JSONArray(stored)
            List(json.length()) { index ->
                json.getDouble(index)
            }
        } catch (e: Exception) {
            emptyList()
        }
    }

    fun count(): Int {
        return getHistory().size
    }

    fun clear() {
        preferences.edit()
            .remove(KEY_HISTORY)
            .apply()
    }
}
