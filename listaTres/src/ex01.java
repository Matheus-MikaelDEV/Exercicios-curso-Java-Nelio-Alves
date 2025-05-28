import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        while(true){
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
            if(senha == 2002){
                break;
            }else {
                System.out.println("Senha errada.");
            }
        }

        sc.close();
    }
}