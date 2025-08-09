package questao019;

import java.util.Scanner;

public class Questão19 {
    public static void main (String[]args)
    {
         Scanner scanner = new Scanner(System.in);
         System.out.print ("Digite um valor entre 1 e 7:");
         int num = scanner.nextInt ();

         switch (num) {
             case 1 :
                 System.out.printf ("Domingo");
                 break;
              case 2 :
                 System.out.printf ("Segunda");
                 break;
              case 3 :
                 System.out.printf ("Terça");
                 break;
              case 4 :
                 System.out.printf ("Quarta");
                 break;
              case 5 :
                 System.out.printf ("Quinta");
                 break;
              case 6 :
                 System.out.printf ("Sexta");
                 break;
              case 7 :
                 System.out.printf ("Sábado");
                 break;
             default:
                 throw new AssertionError();
         }
    }
}
