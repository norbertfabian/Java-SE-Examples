package cz.nfabian.javaexamples.numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers {

    public static void main(String[] args) {

        // Round to 2 decimals
        double price = 1.85;
        double rate = 0.065;

        double fullResult = price - (price * rate);
        double roundedResult = Math.round(fullResult * 100) / 100.0;

        System.out.println("Full result (double): " + fullResult); // Full result (double): 1.7297500000000001
        System.out.println("Rounded result (double): " + roundedResult); // Rounded result (double): 1.73

        // BigDecimal - better for decimal numbers
        BigDecimal price2 = BigDecimal.valueOf(1.85);
        BigDecimal rate2 = BigDecimal.valueOf(0.065);

        BigDecimal fullResult2 = price2.subtract(price2.multiply(rate2));
        BigDecimal roundedResult2 = fullResult2.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Full result (BigDecimal): " + fullResult2); // Full result (BigDecimal): 1.72975
        System.out.println("Rounded result (BigDecimal): " + roundedResult2); // Rounded result (BigDecimal): 1.73

    }
}
