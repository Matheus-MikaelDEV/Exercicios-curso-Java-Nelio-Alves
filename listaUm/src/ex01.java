import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, res;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        res = a + b;

        System.out.printf("A soma entre %d e %d é %d.\n", a, b, res);

        sc.close();
    }
}