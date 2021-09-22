package dk.danielgron.mockitotesting.mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    @BeforeEach
    void setUp() {
    }

    // (32°F − 32) × 5/9 = 0°C
    // (F - 32) x (5/9)
    @Test
    void shouldReturnZeroWhenGiven32(){
        //Arrange
        var expected = BigDecimal.valueOf(0);
        var converter = new TempConverter();

        //Act
        var result = converter.ConvertToCelsius(new BigDecimal(32));

        //Assert
        assertEquals(expected, result);
    }

    @AfterEach
    void tearDown() {
    }
}