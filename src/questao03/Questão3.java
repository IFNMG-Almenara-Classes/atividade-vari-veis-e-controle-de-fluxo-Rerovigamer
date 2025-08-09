package questao03;

import java.util.Scanner;

public class Questão3 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite um valor:");
        float num = scanner.nextFloat ();

        if (num %2 == 0){
            System.out.printf ("Esse numero é par");
        }
        else 
        {
           System.out.print ("Esse valor é impar");
        }
            
        }   
    }

