package questao021;

import java.util.Scanner;

public class Questão21 {
    public static void main (String[]args)
    {
       Scanner scanner = new Scanner(System.in);

       System.out.print ("Digite a sua idade:");
       int idade = scanner.nextInt ();

       System.out.print ("Digite por quantos anos já trabalhou :");
       int anos = scanner.nextInt ();

       if ( idade >= 60 || anos > 30 || idade >= 60 && anos > 25)
       {
         System.out.print ("Já pode aposentar");
       }
       else 
       {
         System.out.print ("não pode aposentar");
       }
}
}
