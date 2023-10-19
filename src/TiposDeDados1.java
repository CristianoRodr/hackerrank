import java.util.Scanner;
import java.math.BigInteger;

public class TiposDeDados1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Número de casos de teste

        for (int i = 0; i < t; i++) {
            String input = in.next();
            BigInteger x = new BigInteger(input);

            System.out.println(x + " can be fitted in:");

            if (x.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && x.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                System.out.println("* byte");
            }
            if (x.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && x.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                System.out.println("* short");
            }
            if (x.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && x.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                System.out.println("* int");
            }
            if (x.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && x.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                System.out.println("* long");
            }
            if (x.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || x.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                System.out.println(x + " can't be fitted anywhere.");
            }
        }
        in.close();
    }
}
