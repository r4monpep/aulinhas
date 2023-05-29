import java.util.Scanner;

public class bob {
 public static void main (String[] args) { 
   Scanner nomeUsuario = new Scanner(System.in);

  System.out.print("como vc chama?");
  String nome = nomeUsuario.nextLine();
  System.out.print("olá " + nome + "!");

 }
}
