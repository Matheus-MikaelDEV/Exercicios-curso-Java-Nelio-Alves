import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        while(true) {
            System.out.println("Digite a cordenada X: ");
            x = sc.nextDouble();
            System.out.println("Digite a cordenada Y: ");
            y = sc.nextDouble();
                if(x > 0 && y > 0) {
                    System.out.println("Primeiro.");
                }else if(x < 0 && y > 0) {
                    System.out.println("Segundo.");
                }else if(x < 0 && y < 0) {
                    System.out.println("Terceiro.");
                }else if(x > 0 && y < 0) {
                    System.out.println("Quarto.");
                }else {
                    break;
                }
        }

        sc.close();
    }
}
