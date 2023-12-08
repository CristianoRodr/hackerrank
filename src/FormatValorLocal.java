import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatValorLocal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = scanner.nextDouble();

        String formatoUS = formatarNumero(valor, Locale.US);
        String formatoIndia = formatarNumero(valor, new Locale("en", "IN"));
        String formatoChina = formatarNumero(valor, Locale.CHINA);
        String formatoFrance = formatarNumero(valor, Locale.FRANCE);

        scanner.close();

        System.out.println("US: " + formatoUS);
        System.out.println("India: " + formatoIndia);
        System.out.println("China: " + formatoChina);
        System.out.println("France: " + formatoFrance);
    }

    private static String formatarNumero(double valor, Locale locale) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(locale);
        return formato.format(valor);
    }
}
