import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strA = scanner.next();
        String strB = scanner.next();
        scanner.close();

        if (areAnagrams(strA, strB)) {
            System.out.println("Anagramas");
        } else {
            System.out.println("Não Anagramas");
        }
    }

    public static boolean areAnagrams(String strA, String strB) {
        if (strA.length() != strB.length()) {
            return false;
        }

        char arrA []= strA.toLowerCase().toCharArray();
        char arrB []= strB.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }
}
