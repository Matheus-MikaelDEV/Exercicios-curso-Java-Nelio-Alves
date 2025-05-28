import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double num1, num2, div;

        for (int i = 0; i <= number; i++) {
            num1 = sc.nextDouble();
            sc.nextLine();
            num2 = sc.nextDouble();
            sc.nextLine();

            div = num1 / num2;

            if (num1 == 0 || num2 == 0) {
                System.out.println("Divisão impossível.");
            }else {
                System.out.println(div);
            }
        }

        sc.close();
    }
}
