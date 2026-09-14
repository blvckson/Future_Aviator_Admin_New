
private val preferences =
    context.getSharedPreferences("aviator_history", Context.MODE_PRIVATE)

private val key = "multipliers"

fun addMultiplier(value: Double) {
    val history = getHistory().toMutableList()
    history.add(value)

    val array = JSONArray()
    history.forEach { array.put(it) }

    preferences.edit()
        .putString(key, array.toString())
        .apply()
}

fun getHistory(): List<Double> {
    val saved = preferences.getString(key, null) ?: return emptyList()

    return try {
        val array = JSONArray(saved)
        List(array.length()) { index ->
            array.getDouble(index)
        }
    } catch (e: Exception) {
        emptyList()
    }
}

fun count(): Int {
    return getHistory().size
}
