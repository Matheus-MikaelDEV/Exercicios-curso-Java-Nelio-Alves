package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] p = new People[n];

        for (int i = 0; i < p.length; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Gênero (M/F): ");
            char gender = sc.next().charAt(0);
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            p[i] = new People(height, gender);
        }

        double shorterHeight = p[0].getHeight(), greaterHeight = 0, avg = 0, sum = 0;
        int man = 0, woman = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getHeight() < shorterHeight) {
                shorterHeight = p[i].getHeight();
            }

            if (p[i].getHeight() > greaterHeight) {
                greaterHeight = p[i].getHeight();
            }

            if (p[i].getGender() == 'F' || p[i].getGender() == 'f') {
                sum += p[i].getHeight();
                woman ++;
            }else if (p[i].getGender() == 'M' || p[i].getGender() == 'm') {
                man++;
            }else {
                System.out.println("Gênero inválido.");
            }
        }

        avg = sum / woman;

        System.out.printf("Menor altura: %.2f\n", shorterHeight);
        System.out.printf("Maior altura: %.2f\n", greaterHeight);
        System.out.printf("Altura média das mulheres: %.2f\n", avg);
        System.out.printf("Número de homens: %d.\n", man);

        sc.close();
    }
}