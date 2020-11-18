package cz.nfabian.javaexamples.localization;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class NumbersLocalization {

    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(2.99);
        Double tax = 0.2;
        int quantity = 12050;

        Locale locale = new Locale("en", "GB");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        System.out.println("En price: " + currencyFormat.format(price)); // En price: £2.99
        System.out.println("En percentage: " + percentageFormat.format(tax)); // En percentage: 20%
        System.out.println("En quantity: " + numberFormat.format(quantity)); // En quantity: 12,050
    }
}
