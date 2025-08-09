package questao020;

import java.util.Scanner;

public class Questão20 {
    public static void main (String[]args)
    {
          Scanner scanner = new Scanner(System.in);

          System.out.print ("Digite um valor:");
          int num = scanner.nextInt();

          if (num %3 == 0 && num %5 == 0)
          {
            System.out.print ("Erro");
          }
          else if (num %3 == 0 && num %5 != 0)
          {
            System.out.print ("esse numero é válido, é divisivel por 3 e não por 5:" + num);
          }
          else if (num %5 == 0 && num %3 != 0)
          {
            System.out.print ("esse numero é válido, é divisivel por 5 e não por 3:" + num);
          }
          else if (num %3 != 0 && num %5 != 0)
          {
            System.out.print ("não é divisivel por 3 nem por 5");
          }
    }
}
