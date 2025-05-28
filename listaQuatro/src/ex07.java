import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double n1, n2;
        for (int i = 1; i <= n; i++) {
            n1 = Math.pow(i, 2);
            n2 = Math.pow(i, 3);

            System.out.printf("%d, %.0f, %.0f\n", i, n1, n2);
        }

        sc.close();
    }
}
