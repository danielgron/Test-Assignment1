package dk.danielgron.mockitotesting.mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanConverterTest {

    @BeforeEach
    void setUp() {
    }

    // The symbols are I, V, X, L, C, D, and M, standing respectively for 1, 5, 10, 50, 100, 500, and 1,000
    @Test
    void shouldReturnIWhenGiven1() throws Exception {
        //Arrange
        var expected = "I";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(1);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnVWhenGiven5() throws Exception {
        //Arrange
        var expected = "V";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(5);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnXWhenGiven10() throws Exception {
        //Arrange
        var expected = "X";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(10);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnLWhenGiven50() throws Exception {
        //Arrange
        var expected = "L";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(50);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnCWhenGiven100() throws Exception {
        //Arrange
        var expected = "C";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(100);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnLWhenGiven500() throws Exception {
        //Arrange
        var expected = "D";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(500);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnLWhenGiven1000() throws Exception {
        //Arrange
        var expected = "M";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(1000);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnIXWhenGiven9() throws Exception {
        //Arrange
        var expected = "IX";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(9);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnILWhenGiven49() throws Exception {
        //Arrange
        var expected = "XLIX";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(49);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnIMWhenGiven999() throws Exception {
        //Arrange
        var expected = "CMXCIX";
        var converter = new RomanNumeralConverter();

        //Act
        var result = converter.ConvertToRomanNumeral(999);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldFailWhenGiven0() throws Exception {
        var converter = new RomanNumeralConverter();

        //Act / Assert
        var result = assertThrows(Exception.class, () -> converter.ConvertToRomanNumeral(0));

    }


    @AfterEach
    void tearDown() {
    }
}