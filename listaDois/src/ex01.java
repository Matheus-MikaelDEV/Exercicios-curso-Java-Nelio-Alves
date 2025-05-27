import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Não negativo.");
        }else {
            System.out.println("Negativo.");
        }

        sc.close();
    }
}