import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, tri, cir, tra, quad, ret;

        System.out.println("O valor de A:");
        A = sc.nextDouble();
        System.out.println("O valor de B:");
        B = sc.nextDouble();
        System.out.println("O valor de C:");
        C = sc.nextDouble();

        tri = (A * C) / 2;
        System.out.printf("A área do triângulo dado pela base A e altura C = %.3f\n", tri);
        cir = Math.PI * Math.pow(C, 2);
        System.out.printf("A área do triângulo dado pelo raio C = %.3f\n", cir);
        tra = ((A + B) * C) / 2;
        System.out.printf("A área do trapézio  dado pelas bases A e B e altura C = %.3f\n", tra);
        quad = B * B;
        System.out.printf("A área do quadrado dado pelo lado B = %.3f\n", quad);
        ret = B * A;
        System.out.printf("A área do retângulo dado pelo lado A e B = %.3f\n", ret);

        sc.close();
    }
}
