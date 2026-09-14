
private val preferences =
    context.getSharedPreferences("aviator_history", Context.MODE_PRIVATE)

private val key = "multipliers"

fun addMultiplier(value: Double) {
    val history = getHistory().toMutableList()
    history.add(value)

    preferences.edit()
        .putString(key, history.joinToString(","))
        .apply()
}

fun getHistory(): List<Double> {
    val saved = preferences.getString(key, "") ?: ""

    if (saved.isBlank()) {
        return emptyList()
    }

    return saved.split(",").mapNotNull { it.toDoubleOrNull() }
}

fun count(): Int {
    return getHistory().size
}
