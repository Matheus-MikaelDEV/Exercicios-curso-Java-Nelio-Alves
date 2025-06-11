package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Valores negativos:\n");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0.0) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }
    }
}