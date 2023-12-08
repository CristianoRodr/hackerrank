import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoString = 15;
        int tamanhoInt = 3;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String texto = sc.next();
            int numero = sc.nextInt();
            String resultado = String.format("%-" + tamanhoString + "s", texto);
            String num = String.format("%0" + tamanhoInt + "d%n", numero);
            System.out.print(resultado);
            System.out.print(num);
        }
        System.out.println("================================");
    }
}