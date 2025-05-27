import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double eixox, eixoy;

        System.out.println("Eixo X:");
        eixox = sc.nextDouble();
        System.out.println("Eixo Y:");
        eixoy = sc.nextDouble();

        if (eixox >= 0 && eixoy > 0 || eixox > 0 && eixoy >= 0) {
            System.out.println("Q1");
        }else if (eixox < 0 && eixoy > 0) {
            System.out.println("Q2");
        }else if (eixox < 0 && eixoy < 0){
            System.out.println("Q3");
        }else if (eixox > 0 && eixoy < 0){
            System.out.println("Q4");
        }else {
            System.out.println("Origem.");
        }

        sc.close();
    }
}