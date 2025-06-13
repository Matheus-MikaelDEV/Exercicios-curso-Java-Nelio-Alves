package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Quantas colunas? ");
        int m = sc.nextInt();
        sc.nextLine();

        int [][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.print("Qual valor você deseja encontrar? ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Posição %d,%d:\n", i, j);
                    if (j < m - 1) {
                        System.out.printf("Direita: %d\n", matriz[i][j + 1]);
                    }
                    if (j > 0) {
                        System.out.printf("Esquerda: %d\n", matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Acima: %d\n", matriz[i - 1][j]);
                    }
                    if (i < n - 1) {
                        System.out.printf("Abaixo: %d\n", matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}