import java.util.Scanner;

public class kk {
    

    public static void main (String[] args) { 
        int num=0;
        Scanner scanner = new Scanner(System.in);
     
       System.out.print("Qual foi a nota do aluno ?");
       num = scanner.nextInt();


        if (num < 6){
            System.out.println("Aluno Aprovado! ");
        } else {
            System.out.println("Aluno Reprovado! ");
        }
}
}