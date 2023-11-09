import java.util.Scanner;

public class Paralelogramo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int H =scanner.nextInt();
            int B  =scanner.nextInt();
            if (H <= 0 || B <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            int area = (int) H * B;
            System.out.println(area);

        } catch (NumberFormatException e) {
            System.out.println("java.lang.Exception: Entrada invalida. Certifique-se de inserir numeros validos.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
