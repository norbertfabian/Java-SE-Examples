package cz.nfabian.javaexamples.serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateHash {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String secretMessage = "secretMessage";

        String hash = null;
        try (ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
                OutputStreamWriter out = new OutputStreamWriter(byteArrayOutput)) {

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            out.write(secretMessage);
            hash = new BigInteger(1, md.digest(byteArrayOutput.toByteArray())).toString(16);
        }

        // hash - contains the hash
    }
}
