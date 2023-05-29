import java.util.Scanner;
public class java {
     
    public static void main(String[] args) {
        do {
        int opcao =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opcao 1: Lanche Natural.");
        System.out.println("Opcao 2: Fritura.");
        System.out.println("Opcao 3: Arroz e Feijao. ");
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
         } while (opcao < 1 || opcao > 3);
         scanner.close();
     }    
}
}