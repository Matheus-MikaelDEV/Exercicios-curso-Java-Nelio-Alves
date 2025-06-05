package application;

import entities.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        funcionario f = new funcionario();

        System.out.print("Nome: ");
        f.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        f.salario = sc.nextDouble();
        System.out.print("Taxa: ");
        f.taxa = sc.nextDouble();

        System.out.printf("Funcionário: %s, R$ %.2f\n", f.nome, f.salarioLiquido());

        System.out.print("Digite a porcentagem para aumentar o salário: ");
        f.aumentarSalario(sc.nextDouble());

        System.out.printf("Dados atualizados: %s, R$ %.2f\n", f.nome, f.salarioLiquido());
    }
}