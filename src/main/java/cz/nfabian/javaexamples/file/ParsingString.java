package cz.nfabian.javaexamples.file;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ResourceBundle;

public class ParsingString {

    private static final String CONFIG_LOCATION = "file.parsing.config";

    private static ResourceBundle config = ResourceBundle.getBundle(CONFIG_LOCATION);
    private static MessageFormat messageFormat = new MessageFormat(config.getString("message.format"));

    public static void main(String[] args) throws ParseException {
        Object[] parsedMessage = messageFormat.parse("first value,second value,third value");

        assert parsedMessage[0].equals("first value");
        assert parsedMessage[1].equals("second value");
        assert parsedMessage[2].equals("third value");
    }
}
