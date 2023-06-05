import java.util.Scanner;

public class avaliaçao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema do fast-food! ");
        System.out.println("Por favor, faça seu pedido:");

        System.out.println("1. Hamburguer simples");
        System.out.println("2. Hamburguer medio");
        System.out.println("3. Harburguer completo");
        System.out.println("4. Hotdog");
        System.out.println("5. batata");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Você escolheu hamburguer simples. O pedido sera preparado. ");
            break;
            case 2:
            System.out.println("Você escolheu hamburguer medio. O pedido sera preparado. ");
            break;
            case 3:
            System.out.println("Voce escolheu hamburguer completo. O pedido sera preparado. ");
            break;
            case 4:
            System.out.println("Voce escolheu hotdog. O pedido sera preparado. ");
            break;
            case 5:
            System.out.println("Você escolheu batata. O pedido sera preparado. ");
            break;
         }
       
         System.out.println("Obrigado pelo seu pedido! Aguarde");
        }
 
}
