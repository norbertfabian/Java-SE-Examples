package cz.nfabian.javaexamples.localization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TextLocalization {

    private static final String MESSAGES_LOCATION = "localization.messages";

    public static void main(String[] args) {
        Locale enLocale = new Locale("en", "GB");
        ResourceBundle enBundle = ResourceBundle.getBundle(MESSAGES_LOCATION, enLocale);
        String enMessagePattern = enBundle.getString("hello");
        System.out.println(MessageFormat.format(enMessagePattern, "Norbert")); // Hello Norbert

        Locale skLocale = new Locale("sk");
        ResourceBundle skBundle = ResourceBundle.getBundle(MESSAGES_LOCATION, skLocale);
        String skMessagePattern = skBundle.getString("hello");
        System.out.println(MessageFormat.format(skMessagePattern, "Norbert")); // Ahoj Norbert
    }
}
