package org.example

fun validateCitizenID(id: String): Boolean {
    if (id.length != 13) return false
    if (!id.all { it.isDigit() }) return false

    val sum = (0..11).sumOf { i ->
        id[i].digitToInt() * (13 - i)
    }

    val expectedCheckDigit = (11 - (sum % 11)) % 10
    val actualCheckDigit = id[12].digitToInt()

    return expectedCheckDigit == actualCheckDigit
}
