import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Digite um numero: ");
        num = sc.nextDouble();

        if (num >= 0 && num <= 25) {
            System.out.println("Intervalo 0 a 25.");
        }else if (num > 25 && num <= 50) {
            System.out.println("Intervalo 25 a 50.");
        }else if (num > 50 && num <= 75) {
            System.out.println("Intervalo 50 a 75.");
        }else if (num > 75 && num <= 100) {
            System.out.println("Intervalo 75 a 100.");
        }else {
            System.out.println("fora do intervalo.");
        }

        sc.close();
    }
}
