package questao012;

import java.util.Scanner;

public class Questão12 {
    public static void main (String[]args)
    {
       Scanner scanner = new Scanner(System.in);
       int soma = 0;
       int num;
       int quantidade = 0;
       int media;
       int par = 0;
       do { 
          System.out.print("digite um valor:");
          num = scanner.nextInt();
           
          soma += num;
          if (num != 0)
          {
            quantidade += 1;
            
          if (num %2 == 0)
          {
            par += 1;
          }
          }
          
       }while (num != 0);

       media = soma / quantidade;

       System.out.println("media:" + media);
       System.out.println("quantidade de par:" + par);
    }
}
