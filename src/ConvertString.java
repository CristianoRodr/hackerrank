import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        if (n >= -100 && n <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Answer");
        }
    }
}