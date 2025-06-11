package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("De quantas pessoas você vai armazenar os dados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Person(idade, nome, altura);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }

        double averageHeight = sum / vect.length, percentage = 0;
        int j = 0;

        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAge() < 16) {
                j++;
            }

            percentage = ((double) j / vect.length) * 100.0;
        }

        System.out.printf("Altura média: %.2f\n", averageHeight);

        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n", percentage);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }
    }
}