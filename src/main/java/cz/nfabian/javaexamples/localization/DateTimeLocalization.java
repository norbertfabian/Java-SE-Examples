package cz.nfabian.javaexamples.localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeLocalization {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Locale locale = new Locale("en", "GB");

        DateTimeFormatter mediumDateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(locale);
        System.out.println("Medium format: " + mediumDateFormat.format(date)); // Medium format: 11 Oct 2020
        // or: date.format(mediumDateFormat);

        DateTimeFormatter patternFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy").localizedBy(locale);
        System.out.println("Pattern format: " + patternFormat.format(date)); // Pattern format: 11-10-2020

    }
}
