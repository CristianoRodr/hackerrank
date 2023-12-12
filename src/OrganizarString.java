import java.util.Scanner;

public class OrganizarString {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String a = Scan.nextLine();
        String b = Scan.nextLine();

        int tamnaho = a.length() + b.length();
        System.out.println(tamnaho);
        if (a.compareToIgnoreCase(b) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() + " "
                + b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase());
    }
}
