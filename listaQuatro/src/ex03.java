import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double num1, num2, num3;
        double [] media = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Segundo número: ");
            num2 = sc.nextInt();
            System.out.println("Terceiro número: ");
            num3 = sc.nextInt();

            media[i] = ((num1 * 2 + num2 * 3 + num3 * 5) / 10);
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(media[i]);
        }
        
        sc.close();
    }
}
