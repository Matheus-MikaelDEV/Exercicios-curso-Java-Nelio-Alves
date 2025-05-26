import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, area;
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("O valor da área dado pelo raio é %.4f.\n", area);

        sc.close();
    }
}
