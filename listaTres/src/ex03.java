import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, alcool = 0, gasolina = 0, diesel = 0;

        while(true){
            System.out.println("Qual combustível você deseja abastecer?");
            System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                alcool += 1;
            }else if(opcao == 2){
                gasolina += 1;
            }else if(opcao == 3){
                diesel += 1;
            } else if (opcao == 4) {
                System.out.printf("Muito obrigado!\nÁlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
                break;
            }else {
                System.out.println("Invalído.");
            }
        }

        sc.close();
    }
}
