package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão armazenadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] person = new Person[n];

        for (int i = 0; i < person.length; i++) {
            System.out.print("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("\nNome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();

            person[i] = new Person(name, age);
        }

        double older = 0;
        String nameOlder = "";

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > older) {
                older = person[i].getAge();
                nameOlder = person[i].getName();
            }
        }

        System.out.printf("Pessoa mais velha: %s, %d anos.\n", nameOlder, (int) older);
    }
}
