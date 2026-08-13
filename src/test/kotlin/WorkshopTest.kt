package org.example
import kotlin.test.Test
import kotlin.test.assertEquals


class WorkshopTest {

    // --- Tests for Workshop #1: Unit Converter ---

    // celsius input: 20.0
    // expected output: 68.0
    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = 20.0
        val expectedFahrenheit = 68.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
    }

    // celsius input: 0.0
    // expected output: 32.0
    @Test
    fun `test celsiusToFahrenheit with zero`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = 0.0
        val expectedFahrenheit = 32.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "0°C should be 32°F")

    }

    // celsius input: -10.0
    // expected output: 14.0
    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = -10.0
        val expectedFahrenheit = 14.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "-10°C should be 14°F")
    }

    // test for kilometersToMiles function
    // kilometers input: 1.0
    // expected output: 0.621371
    @Test
    fun `test kilometersToMiles with one kilometer`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val kilometersInput = 1.0
        val expectedOutput = 0.621371

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualMiles = kilometersToMiles(kilometersInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedOutput, actualMiles, 0.001, "1.0 kilometers should be 0.621371 Miles")
    }

    // --- Tests for Workshop #1: Unit Converter End ---

    // --- Tests for Workshop #2: Data Analysis Pipeline ---
    // ทำการแก้ไขไฟล์ Workshop2.kt ให้มีฟังก์ชันที่ต้องการทดสอบ
    // เช่น ฟังก์ชันที่คำนวณผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // ในที่นี้จะสมมุติว่ามีฟังก์ชันชื่อ calculateTotalElectronicsPriceOver500 ที่รับ List<Product> และคืนค่า Double
    // จงเขียน test cases สำหรับฟังก์ชันนี้ โดยตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // 🚨
    @Test
    fun `Test Sum Electronics Price Over 500`(){
        val products = listOf(
            Product("Laptop", price = 35000.0, category = "Electronics"),
            Product("Smartphone", price = 25000.0, category = "Electronics"),
            Product("T-shirt", price = 450.0, category = "Apparel"),
            Product("Monitor", price = 7500.0, category = "Electronics"),
            Product("Keyboard", price = 499.0, category = "Electronics"),
            Product("Jeans", price = 1200.0, category = "Apparel"),
            Product("Headphones", price = 1800.0, category = "Electronics")
        )
        val expectedOutput = 69300.0

        val actualOutput = calculateTotalElectronicsPriceOver500(products)

        assertEquals(expectedOutput, actualOutput, 0.001, "Sum should be 69300.0 Bath")
    }
    // จงเขียน test cases เช็คจำนวนสินค้าที่อยู่ในหมวด 'Electronics' และมีราคามากกว่า 500 บาท
    // 🚨
    @Test
    fun `Test Count Electronics Price Over 500`(){
        val products = listOf(
            Product("Laptop", price = 35000.0, category = "Electronics"),
            Product("Smartphone", price = 25000.0, category = "Electronics"),
            Product("T-shirt", price = 450.0, category = "Apparel"),
            Product("Monitor", price = 7500.0, category = "Electronics"),
            Product("Keyboard", price = 499.0, category = "Electronics"),
            Product("Jeans", price = 1200.0, category = "Apparel"),
            Product("Headphones", price = 1800.0, category = "Electronics")
        )
        val expectedOutput = 4

        val actualOutput = calculateTotalElectronicsCount(products)

        assertEquals(expectedOutput.toDouble(), actualOutput.toDouble(), 0.001, "Count should be 4.0")
    }

    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
}