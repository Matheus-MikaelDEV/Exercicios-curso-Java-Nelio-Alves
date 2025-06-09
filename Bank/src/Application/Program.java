package Application;

import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double initialBalance;

        System.out.print("Qual o número da conta? ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual o nome do titular da conta? ");
        String accountHolderName = sc.nextLine();
        System.out.print("Haverá depósito inicial? (s/n) ");
        String op = sc.nextLine();
        if (op.toLowerCase().equals("s")) {
            System.out.print("Entre o valor de depósito inicial: ");
            initialBalance = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(accountNumber, accountHolderName, initialBalance);
        }

        Account account = new Account(accountNumber, accountHolderName);

        do {
            System.out.println("Não é possível alterar o número da conta.\nEscolha uma das opções abaixo:");
            System.out.println("1 - Alterar o nome do titular da conta\n2 - Depositar\n3 - Sacar\n4 - Exibir dados da conta\n5 - Sair");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Entre o novo nome do titular da conta: ");
                    String newName = sc.nextLine();
                    account.setAccountHolderName(newName);
                    break;
                case 2:
                    System.out.print("Quantos você deseja depositar? ");
                    double Amount = sc.nextDouble();
                    account.addBalance(Amount);
                    break;
                case 3:
                    System.out.print("Quantos você deseja sacar? ");
                    double amount = sc.nextDouble();
                    account.subBalance(amount);
                    break;
                case 4:
                    System.out.printf("Dados da conta:\nNúmero da conta: %d\nSaldo da conta: R$%.2f\nTitular da conta: %s\n", account.getAccountNumber(), account.getBalance(), account.getAccountHolderName());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
            }
        }while (true);
    }
}