import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Digite o valor do primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o valor do segundo número: ");
        b = sc.nextInt();
        System.out.println("Digite o valor do terceiro número: ");
        c = sc.nextInt();
        System.out.println("Digite o valor do quarto número: ");
        d = sc.nextInt();

        dif = (a * b) - (c * d);

        System.out.printf("Com os números %d, %d, %d, e %d se deu a diferença por %d", a, b, c, d, dif);

        sc.close();
    }
}
