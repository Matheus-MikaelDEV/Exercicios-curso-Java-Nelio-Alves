import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, qnt;
        double preco, res;

        for (int i = 1; i <= 2; i++) {
            System.out.printf("Qual o código da peça %d?\n", i);
            cod = sc.nextInt();
            System.out.println("Quantas você comprou?");
            qnt = sc.nextInt();
            System.out.println("Qual o preço de cada uma?");
            preco = sc.nextDouble();

            res = (double) preco * qnt;

            System.out.printf("Valor a pagar da peça %d: R$%.2f\n", i, res);
        }

        sc.close();
    }
}
