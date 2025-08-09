package questao014;

import java.util.Scanner;

public class Questão14 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int valor;
        int desconto;
        int total;
        do {
             menu ();
             System.out.print("Digite uma opção:");
             opcao = scanner.nextInt();

             switch (opcao) {
                 case 1:
                   System.out.println("Funcionário");
                   System.out.print("Digite o valor da pizza:");
                   valor = scanner.nextInt ();
                   desconto = valor * 10/100;
                   total = valor - desconto;
                   System.out.println("Valor da pizza apos desconto é:"+ total);
                     
                    break;
                 case 2:
                   System.out.println("Cliente");
                   System.out.print("Digite o valor da pizza:");
                   valor = scanner.nextInt ();
                   System.out.println("Valor da pizza sem desconto:"+ valor);
                     
                    break;
                 case 3:
                   System.out.println("Cliente vip");
                   System.out.print("Digite o valor da pizza:");
                   valor = scanner.nextInt ();
                   desconto = valor * 5/100;
                   total = valor - desconto;
                   System.out.println("Valor da pizza apos desconto é:"+ total);
                     
                     break;
                 default:
                    System.out.println ("Você não se classifica em nunhuma dessas opções");
                    menu ();
             }

        } while (opcao != 0);
    }
    public static void menu ()
    {
        System.out.println("----MENU----");
        System.out.println("1-Funcionário");
        System.out.println("2-Cliente");
        System.out.println("3-Cliente vip");
    }
}
