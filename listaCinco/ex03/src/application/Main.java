package application;

import entities.nota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nota n = new nota();

        n.lerValores(sc);
        n.calculaMedia();
        n.exibirResultado();
    }
}