import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d",num,i,num*i).println();
        }

    }
}