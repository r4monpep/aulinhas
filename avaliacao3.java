import java.util.Scanner;

public class avaliacao3 {


 public static void main (String[] args) { 
   Scanner teclado = new Scanner(System.in);

  System.out.print("como vc chama?");
  String nome = teclado.nextLine();
  System.out.print("olá " + nome + " Bem vindo !");
  System.out.println("Escolha o numero do seu pedido:");


    System.out.println("Bem vindo ao sistema do fast-food! ");
    System.out.println("Por favor, faça seu pedido:");

    System.out.println("1. Hamburguer simples");
    System.out.println("2. Hamburguer medio");
    System.out.println("3. Harburguer completo");
    System.out.println("4. Hotdog");
    System.out.println("5. batata");

    int opcao = teclado.nextInt();

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
     teclado.close();
    }



}
