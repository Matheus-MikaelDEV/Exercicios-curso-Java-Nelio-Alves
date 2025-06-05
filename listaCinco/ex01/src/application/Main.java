package application;

import java.util.Scanner;
import entities.retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        retangulo retangulo = new retangulo();

        retangulo.qualMedidas(sc);

        retangulo.calcularValores();
    }
}