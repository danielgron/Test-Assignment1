package dk.danielgron.mockitotesting.mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    @BeforeEach
    void setUp() {
    }

    // (32°F − 32) × 5/9 = 0°C
    // (F - 32) x (5/9)
    @Test
    void shouldReturnZeroWhenGiven32() throws Exception {
        //Arrange
        var expected = new BigDecimal(0).setScale(2);
        var converter = new TempConverter();

        //Act
        var result = converter.ConvertToCelsius(new BigDecimal(32));

        //Assert
        assertTrue(expected.equals(result));
    }

    @Test
    void shouldReturn38WhenGiven100() throws Exception {
        //Arrange
        var expected = new BigDecimal(38).setScale(0);
        var converter = new TempConverter();

        //Act
        var result = converter.ConvertToCelsius(new BigDecimal(100)).setScale(0, RoundingMode.HALF_UP);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void shouldFailIfBelow0Kelvin(){
        //Arrange
        var expected = BigDecimal.valueOf(0);
        var converter = new TempConverter();

        //Act / Assert
        var result = assertThrows(Exception.class, () -> converter.ConvertToCelsius(new BigDecimal(-460)));

    }

    @Test
    void shouldReturnOriginalIfConvertedToAndFrom() throws Exception {
        //Arrange
        var expected = BigDecimal.valueOf(42);
        var converter = new TempConverter();

        //Act
        var celsius = converter.ConvertToCelsius(new BigDecimal(42));
        var result = converter.ConvertToFahrenheit(celsius).setScale(0, RoundingMode.HALF_UP);

        //Assert
        assertEquals(expected, result);

    }

    @AfterEach
    void tearDown() {
    }
}