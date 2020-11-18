package cz.nfabian.javaexamples.release;

public class SwitchExpression {

    public static void main(String[] args) {
        int number = 1;

        // This feature is available since JDK 13
        String result = switch (number) {
            case 1, 2, 3, 4, 5  -> "result one";
            case 6, 7, 8        -> "result two";
            case 9, 10          -> "result three";
            default -> throw new IllegalStateException("Number should not be higher then 10.");
        };

        // Example with a block
        result = switch (number) {
            case 1, 2, 3, 4, 5  -> {
                System.out.println("this is a block");
                yield "result one";
            }
            case 6, 7, 8        -> "result two";
            case 9, 10          -> "result three";
            default -> throw new IllegalStateException("Number should not be higher then 10.");
        };
    }
}
