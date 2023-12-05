import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM DD yyyy", Locale.ENGLISH);
        String dataString = Scan.nextLine();
        LocalDate data = LocalDate.parse(dataString, formatter);

        System.out.println( data.getDayOfWeek());
    }
}
