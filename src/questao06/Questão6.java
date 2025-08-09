package questao06;

import java.util.Scanner;

public class Questão6 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor:");
        Float num1 =  scanner.nextFloat();

        System.out.print("Digite um valor:");
        Float num2 =  scanner.nextFloat();

        System.out.print("Digite um valor:");
        Float num3 =  scanner.nextFloat();

        if (num1 > num2 && num1 > num3)
        {
            System.out.print("O maior numero é:" + num1);
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.print("O maior numero é:" + num2);
        }
        else if (num3 > num2 && num3 > num1)
        {
            System.out.print("O maior numero é:" + num3);
        }
        else 
        {
            System.out.print ("Todos possuem o mesmo valor");
        }
        
    }
}

