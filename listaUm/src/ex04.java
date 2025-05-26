import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        double horas, recebe, res;

        System.out.println("Qual o seu id? ");
        id = sc.nextInt();
        System.out.println("Quantas horas você trabalhou? ");
        horas = sc.nextDouble();
        System.out.println("Quantos você recebe por hora? ");
        recebe = sc.nextDouble();

        res = horas *  recebe;

        System.out.printf("Id:%d\nSalário:%.2f\n", id, res);

        sc.close();
    }
}