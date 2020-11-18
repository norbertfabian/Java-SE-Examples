package cz.nfabian.javaexamples.console;

import java.io.Console;
import java.io.PrintWriter;

public class ConsoleExample {

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not supported");
            return;
        }

        PrintWriter out = console.writer();

        // Common text
        String txt = null;
        while (!(txt = console.readLine()).equals("exit")) {
            out.println("Echo: " + txt);
        }

        // Password
        char[] password = null;
        while (!(password = console.readPassword()).equals("exit")) {
            out.println("Echo: " + password);
        }
    }
}
