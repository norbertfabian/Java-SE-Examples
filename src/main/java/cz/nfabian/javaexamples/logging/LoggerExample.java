package cz.nfabian.javaexamples.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        logger.log(Level.SEVERE, "My sever message to log");
        logger.info("My info message to log");
    }
}
