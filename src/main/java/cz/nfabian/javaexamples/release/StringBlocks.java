package cz.nfabian.javaexamples.release;

public class StringBlocks {

    public static void main(String[] args) {
        int id = 1;

        // String blocks are supported since JDK 13
        String stringBlock = String.format("""
                    SELECT firstName, surname, birthDate, address
                    FROM person
                    WHERE id = %s;
                    """, id);

        System.out.println(stringBlock);
    }
}
