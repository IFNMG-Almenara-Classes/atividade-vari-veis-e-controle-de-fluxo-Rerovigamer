package questao07;

import java.util.Scanner;

public class Questão7 {
    public static void main (String[]args)
    {
          Scanner scanner = new Scanner(System.in);

          System.out.print ("Digite o valor do lado1:");
          float lado1 = scanner.nextFloat();

          System.out.print ("Digite o valor do lado2:");
          float lado2 = scanner.nextFloat();

          System.out.print ("Digite o valor do lado3:");
          float lado3 = scanner.nextFloat();

          if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3)
          {
            System.out.print("é um triagulo equilatero");
          }
          else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
          {
            System.out.print ("Se trata de um triangulo isóceles");
          }
          else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
          {
            System.out.print ("triangulo escaleno");  
          }
          else 
          {
            System.out.print ("Se trata de outros tipos de triangulos");
          }
    }
}

