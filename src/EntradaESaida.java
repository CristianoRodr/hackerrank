import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int vezes = 3;
        for (int i = 0; i < vezes; i++) {
            int imprime = Scan.nextInt();
            System.out.println(imprime);
        }
    }
}
