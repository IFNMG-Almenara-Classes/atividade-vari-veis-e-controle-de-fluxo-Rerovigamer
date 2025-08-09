package questao011;

import java.util.Scanner;

public class Questão11 {
    public static void main (String[]args)
    {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite um número:");
       int num = scanner.nextInt();

       int soma = 0;
       
       for (int i = 0; i < num; i++)
       {
           if (i %2 == 0 && i != 0)
           {
             System.out.print(i);
           }
       }
    }
}

