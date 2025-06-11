package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0, avg = 0, j = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

            if ((vect[i] % 2) == 0) {
                sum += vect[i];
                j++;
                avg = sum / j;
            }
        }

        if (avg != 0) {
            System.out.printf("Média dos pares: %.2f%n", avg);
        } else {
            System.out.println("Nenhum número par digitado.");
        }
    }
}