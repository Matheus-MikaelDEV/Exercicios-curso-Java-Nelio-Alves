import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double horaUm, horaDois, resultado;

        System.out.println("Que horas começou o jogo?");
        horaUm = sc.nextDouble();
        System.out.println("Que horas terminou o jogo?");
        horaDois = sc.nextDouble();

        if (horaUm < horaDois) {
            resultado = horaDois - horaUm;
        }else {
            resultado = 24 - horaUm - horaDois;
        }

        System.out.printf("%.2f", resultado);

        sc.close();
    }
}
