import java.util.Scanner;

public class DesafioDeEntrada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] entradas = new String[50];
        int i = 0;

        for (; i < entradas.length; i++) {
            entradas[i] = scan.nextLine();
            if (entradas[i].equals("")) {
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + " " + entradas[j]);
        }
    }
}