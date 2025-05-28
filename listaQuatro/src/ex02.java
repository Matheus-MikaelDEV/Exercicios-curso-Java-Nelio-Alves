import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();
        int in = 0, out = 0, x;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um numero: ");
            x = sc.nextInt();

            if (x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
        }

        System.out.printf("in: %d, out: %d", in, out);

        sc.close();
    }
}
