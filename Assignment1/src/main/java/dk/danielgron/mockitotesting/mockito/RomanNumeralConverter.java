package dk.danielgron.mockitotesting.mockito;

import java.math.BigDecimal;

public class RomanNumeralConverter {
    public String ConvertToRomanNumeral(int arabNumeral) throws Exception {


        if (arabNumeral <= 0) throw new Exception("Values must be >= 0");
        //https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

        String numberstring = "";

        for (int i = 0; i < arabNumeral; i++) {
            numberstring += "I";
        }

        return String.join("", numberstring)
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

}
