import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Converter {
    public static String calcularSHA256(String entrada) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(entrada.getBytes());

            byte[] bytesHash = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : bytesHash) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {


            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String hashSHA256 = calcularSHA256(input);

            System.out.println(hashSHA256);
        }
    }
}
