package dk.danielgron.mockitotesting.mockito;

import org.apache.commons.lang3.NotImplementedException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TempConverter {
    public BigDecimal ConvertToCelsius(BigDecimal tempInFahrenheit) throws Exception {
        if (tempInFahrenheit.compareTo(new BigDecimal(-459.67)) < 0 )
            throw new Exception("Less than 0 degrees kelvin");

        var result = (tempInFahrenheit.subtract(new BigDecimal(32))).multiply((new BigDecimal(5).divide(new BigDecimal(9), 2, RoundingMode.HALF_UP)));
        return result;
    }

    public BigDecimal ConvertToFahrenheit(BigDecimal tempInCelsius) throws Exception {
        var result = (new BigDecimal(32)).add(tempInCelsius.multiply((new BigDecimal(9).divide(new BigDecimal(5), 2, RoundingMode.HALF_UP))));

        return result;
    }
}
