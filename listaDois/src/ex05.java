import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, quantidade;
        double preco = 0;

        System.out.println("1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante");
        System.out.println("Digite o código do que você comeu: ");
        cod = sc.nextInt();
        System.out.println("Agora a quantidade do que comeu: ");
        quantidade = sc.nextInt();

        switch (cod) {
            case 1:
                preco = (double) quantidade * 4;
                break;
            case 2:
                preco = (double) quantidade * 4.5;
                break;
            case 3:
                preco = (double) quantidade * 5;
                break;
            case 4:
                preco = (double) quantidade * 2;
                break;
            case 5:
                preco = (double) quantidade * 1.5;
                break;
        }

        System.out.printf("Total: R$%.2f", preco);

        sc.close();
    }
}
