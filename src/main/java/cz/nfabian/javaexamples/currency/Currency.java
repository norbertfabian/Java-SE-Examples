package cz.nfabian.javaexamples.currency;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

    public static void main(String[] args) {
        Locale locale = Locale.UK;
        NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(locale);

        BigDecimal price = new BigDecimal("12.13");
        String formattedPrice = numberFormatter.format(price);

        System.out.println("Price: " + formattedPrice); // Price: £12.13
    }
}
