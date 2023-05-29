import java.util.Scanner;
public class calc {
    

    public static void main(String[] args){
        int num1, num2;
        double soma;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        num2 = scanner.nextInt();
        
        if (num1 < 0 ) {
            System.out.println("não e possivel divisao");
          }  else {
            System.out.println(" não e possivel a divisao se o numeros for =0 :(");
          }

        soma = num1 / num2; 
        System.out.println("\nO numero digitado foi: " + num1);
        System.out.println("O numero digitado foi: " + num2);
        System.out.println("\n A divisão entre eles é " + soma);
}
 }

