package questao017;

import java.util.Scanner;

public class Questão17 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
      System.out.print ("Digite um valor:");
      int num = scanner.nextInt ();

      int fat = 1;

      for( int i = 1; i <= num; i++)
      {
         fat *= i;
      }
      System.out.print ("o ressultado do fatorial é:" + fat);
}
}
