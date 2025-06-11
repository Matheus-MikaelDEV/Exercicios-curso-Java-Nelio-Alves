package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vetOne = new double[n];
        double[] vetTwo = new double[n];
        double[] vetThree = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number for vector one: ");
            vetOne[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number for vector two: ");
            vetTwo[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            vetThree[i] = vetOne[i] + vetTwo[i];
        }

        System.out.println("Resulting vector:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\n", vetThree[i]);
        }
    }
}