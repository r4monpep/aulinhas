import java.util.Scanner;

public class avaliacao {
 public static void main (String[] args) { 
   Scanner nomeUsuario = new Scanner(System.in);

  System.out.print("como vc chama?");
  String nome = nomeUsuario.nextLine();
  System.out.print("olá " + nome + " Bem vindo !");
  System.out.println("Escolha o numero do seu pedido:");
  nomeUsuario.close();

  int opcao =1;

  do {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Opcao 1: Combo monster. ");
    System.out.println("Opcao 2: Xtudao.");
    System.out.println("Opcao 3: Mc triste. ");
    System.out.println("\nSelecione sua Refeição: ");
     
         switch (opcao) {
        case 1:
          System.out.println("\nOpcao 1 selecionada.");
          break;
        case 2:
          System.out.println("\nOpcao 2 selecionada.");
          break;
        case 3:
          System.out.println("\nOpcao 3 selecionada.");
          break;
          
        default:
        System.out.println("\nOpcao inválida.");
        break;
         }
      } while (opcao <1 || opcao > 3);
     } 
 }
