import java.util.Scanner;

public class TiposDeDados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nunX = in.nextInt();
        for (int i = 0; i < nunX; i++) {
            String input = in.next();
            if (input.length() <= Long.MAX_VALUE) {
                try {
                    long n = Long.parseLong(input);
                    System.out.println(input + " can be fitted in:");
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(input + " can't be fitted anywhere.");
                }
            } else {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
    }
}
