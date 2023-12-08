import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Converter {
    public static String calcularMD5(String entrada) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

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
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String hashMD5 = calcularMD5(input);

        System.out.println(hashMD5);
    }
}
