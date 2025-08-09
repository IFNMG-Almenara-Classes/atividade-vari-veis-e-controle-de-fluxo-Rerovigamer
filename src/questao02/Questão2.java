package questao02;

import java.util.Scanner;

public class Questão2 {
    public static void main (String[]args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso:");
        float peso = scanner.nextFloat ();

        System.out.print ("Digite a sua altura:");
        float altura = scanner.nextFloat ();
  
        float IMC = peso/(altura * altura);

        if (IMC < 18.5)
        {
          System.out.println ("Aprensenta um estado de magreza");
        }
        else if (IMC >= 18.5 && IMC <= 24.9)
        {
            System.out.println ("Apresenta está saudavel");
        }
        else if (IMC >= 25.0 && IMC <= 29.9)
        {
            System.out.println ("Apresenta está obeso");
        }
         else if (IMC >= 30 && IMC <= 34.9)
        {
            System.out.println ("Obesidade grau 1");
        }
        else if (IMC >= 35 && IMC <= 39.9)
        {
            System.out.println ("Obesidade grau 2 (servera)");
        }
        else if (IMC >= 40)
        {
            System.out.println ("Obesidade grau 3 (morte kkkk)");
        }
        
    }

    }

