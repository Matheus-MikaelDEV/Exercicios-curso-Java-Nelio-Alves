package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nesse pensionato, temos 10 quartos disponíveis.");
        System.out.print("Quantos estudantes irão se hospedar? ");
        int n = sc.nextInt();

        Student[] student = new Student[10];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do estudante %d:\n", i + 1);
            System.out.println("Qual quarto o estudante deseja(0-9)? ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            if (roomNumber > 9) {
                System.out.println("Número de quarto inválido. Por favor, escolha um número entre 0 e 9.");
                i--;
            } else if (student[roomNumber] != null){
                System.out.println("Quarto já ocupado. Por favor, escolha outro quarto.");
                i--;
            } else {
                System.out.printf("Quarto %d reservado para %s (%s).\n", roomNumber, name, email);
                student[roomNumber] = new Student(name, email);
            }
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                System.out.printf("Quarto %d: %s, %s\n", i, student[i].getName(), student[i].getEmail());
            }
        }
    }
}