import java.util.Scanner;

public class Anagrama1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String Primeiro = Scan.nextLine();
        String Segundo = Scan.nextLine();
        int tamanhoPrimeiro = Primeiro.length();
        int tamanhoSegundo = Segundo.length();
        if (tamanhoPrimeiro != tamanhoSegundo) {
            System.out.println("Not Anagrams");
        }
    }
}
