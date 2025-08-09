package questao013;

import java.util.Scanner;

public class Questão13 {
    public static void main (String[]args)
    {

         Scanner scanner = new Scanner(System.in);

         int opcao,soma,subtracao,multiplicacao,divisao;
        do { 
            menu ();
            System.out.print ("Escolha uma opção:");
            opcao = scanner.nextInt();

            switch (opcao)
            {
              case 1: 
                 System.out.print ("Escolhe um valor:");
                 int num = scanner.nextInt();
                 System.out.print ("Escolhe um valor:");
                 int num2 = scanner.nextInt();
                 
                 soma = num + num2;

                 System.out.println("O ressultado da soma é:" + soma);
                 break;

              case 2:
                 System.out.print ("Escolhe um valor:");
                 int num3 = scanner.nextInt();
                 System.out.print ("Escolhe um valor:");
                 int num4 = scanner.nextInt();
                 
                 subtracao = num3 - num4;

                 System.out.println("O ressultado da subtração é:" + subtracao);
                 break;
              case 3:
                 System.out.print ("Escolhe um valor:");
                 int num5 = scanner.nextInt();
                 System.out.print ("Escolhe um valor:");
                 int num6 = scanner.nextInt();
                 
                 divisao = num5/ num6;

                 System.out.println("O ressultado da divisão é:" + divisao);
                 break;
              case 4:
                System.out.print ("Escolhe um valor:");
                 int num7 = scanner.nextInt();
                 System.out.print ("Escolhe um valor:");
                 int num8 = scanner.nextInt();
                 
                 multiplicacao = num7 * num8;

                 System.out.println("O ressultado da multiplicação é:" + multiplicacao);
                 break;
              case 5:
                 System.out.println("Sair");
                 break;
             default:
                menu ();
                break;
                
            }
           
        } while (opcao != 0);
    }
               public static void menu ()
            {
                System.out.println("-----MENU-----");
                System.out.println("1-Soma");
                System.out.println("2-subtração");
                System.out.println("3-divisão");
                System.out.println("4-multiplicação");
                System.out.println("5-sair");
            }
}

