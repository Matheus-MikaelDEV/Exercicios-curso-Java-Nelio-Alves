package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
        }

        double biggestNumber = vect[0];
        int position = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] > biggestNumber) {
                biggestNumber = vect[i];
                position = i;
            }
        }

        System.out.printf("Maior valor: %.1f\nPosição do maior valor: %d", biggestNumber, position);

        sc.close();
    }
}