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

        System.out.print("Valores = ");

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("\nSoma = %.2f\nMédia = %.2f", sum, avg);
    }
}