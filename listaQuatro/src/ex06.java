import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int x = i;
                System.out.println(x);
            }
        }

        sc.close();
    }
}
