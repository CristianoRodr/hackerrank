import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        if (n < 1 && n >= 100) {
            System.out.println("Valor inválido, digite de 1 a 100");
        } else {
            if (n % 2 == 1) {
                System.out.println("Weird");
            } else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else {
                    if (n >= 6 && n <= 20) {
                        System.out.println("Weird");
                    } else
                        System.out.println("Not Weird");
                }
            }
        }
    }
}
