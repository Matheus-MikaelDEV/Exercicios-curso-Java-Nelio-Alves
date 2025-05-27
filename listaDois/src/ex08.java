import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Qual seu salário?");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento.");
        }else if (salario > 2000 && salario <= 3000) {
            imposto = salario * 0.08;
            System.out.printf("Imposto: R$%.2f", imposto);
        }else if (salario > 3000 && salario <= 4500) {
            imposto = salario * 0.18;
            System.out.printf("Imposto: R$%.2f", imposto);
        }else if (salario > 4500) {
            imposto = salario * 0.28;
            System.out.printf("Imposto: R$%.2f", imposto);
        }

        sc.close();
    }
}
