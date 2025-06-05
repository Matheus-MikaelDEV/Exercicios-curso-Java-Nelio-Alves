package entities;

import java.util.Scanner;

public class nota {
    public double nota1, nota2, nota3, media;

    public void lerValores(Scanner sc) {
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
    }

    public void calculaMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public double exibirResultado() {
        if (media >= 60) {
            System.out.println("Aprovado com média: " + media);
            return media;
        } else {
            double falta = 60 - media;
            System.out.printf("Reprovado com média: %.2f. Faltaram %.2f pontos para aprovação.%n", media, falta);
            return media;
        }
    }
}
