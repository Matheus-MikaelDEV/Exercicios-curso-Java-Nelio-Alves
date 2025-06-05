package entities;

import java.util.Scanner;

public class retangulo {
    public double largura;
    public double altura;

    public void qualMedidas(Scanner sc){
        System.out.println("Entre com a largura do retângulo: ");
        largura = sc.nextDouble();
        System.out.println("Entre com a altura do retângulo: ");
        altura = sc.nextDouble();
    }

    public void calcularValores(){
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(largura * largura + altura * altura);

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}
