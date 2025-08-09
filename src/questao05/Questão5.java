package questao05;

import java.util.Scanner;

public class Questão5 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Digite a quantidade de limão que vai comprar:");
        float quantidade = scanner.nextFloat();

        float valor = 0;

        if (quantidade <= 6)
        {
            valor = (float) (quantidade * 0.50);
        }
        else if (quantidade >= 7 && quantidade <= 12)
        {
            valor = (float) (quantidade * 0.30);
        }
        
        System.out.println("O valor total é:"+ valor);
    }
}

