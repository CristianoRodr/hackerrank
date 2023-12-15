import java.util.Scanner;

public class ParteDaString {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String string = Scan.next();
        int start = Scan.nextInt();
        int end = Scan.nextInt();

        String parteDaString = string.substring(start, end);

        System.out.println(parteDaString);
    }
}