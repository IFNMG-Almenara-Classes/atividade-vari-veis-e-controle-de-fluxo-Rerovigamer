package questao04;

import java.util.Scanner;

public class Questão4 {
    public static void main (String []args){
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 4; i++)
    {
        System.out.print ("Digite a senha:");
        float senha = scanner.nextFloat ();

        if (senha != 1234)
        {
            System.out.println("Acesso negado");
        }
        else 
        {
            System.out.println("Acesso permitido");
        }
    }
    
}
}

