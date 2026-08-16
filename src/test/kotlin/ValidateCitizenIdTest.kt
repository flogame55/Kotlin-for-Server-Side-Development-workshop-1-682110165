package org.example

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateCitizenIdTest {
    // STEP:1 เทส 3 ตัวแรก
    @Test
    fun `valid 13 digit id returns ture`(){
        // Arrange
        val id = "1101700185206" // เลขจำลอง check sumท ี่ถูกต้อง
        // Act
        val result = validateCitizenID(id)
        // Assert
        assertTrue(result)
    }

    @Test
    fun `id with wrong length returns false`(){
        assertFalse(validateCitizenID("12345"))
        assertFalse(validateCitizenID("11017001852066"))
        assertFalse(validateCitizenID(""))
    }

    @Test
    fun `id with wrong checksum returns false`() {
        // หลักที่ 13 ต้องเป็น check digit ที่คำนวณจาก 12 หลักแรก
        // 110170018520 → check digit ที่ถูกต้องคือ 6
        assertFalse(validateCitizenID("1101700185207")) // หลักสุดท้ายผิด
        assertFalse(validateCitizenID("1234567890129")) // ที่ถูกคือ ...1

        // ใบที่ checksum ถูกต้อง ต้องยังผ่านอยู่
        assertTrue(validateCitizenID("3509900547250"))
        assertTrue(validateCitizenID("1234567890121"))
    }

    @Test
    fun `valid 13 digit id with thai numerals returns true`() {
        // Arrange: เลขไทย ๑๑๐๑๗๐๐๑๘๕๒๐๖ (ตรงกับ 1101700185206)
        val thaiId = "๑๑๐๑๗๐๐๑๘๕๒๐๖"
        // Act
        val result = validateCitizenID("๑๑๐๑๗๐๐๑๘๕๒๐๖")
        // Assert
        assertTrue(result, "Thai numerals ๑๑๐๑๗๐๐๑๘๕๒๐๖ should be valid")
    }
}