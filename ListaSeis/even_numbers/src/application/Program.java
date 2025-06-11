package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai ler? ");
        int n = sc.nextInt();
        sc.nextLine();

        double [] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Qual número? ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("Números pares: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%.2f ", vect[i]);
            }
        }
    }
}
