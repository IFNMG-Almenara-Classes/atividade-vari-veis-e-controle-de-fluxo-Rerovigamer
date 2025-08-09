package questao015;

import java.util.Scanner;

public class Questão15 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print ("Digite um numero:");
        num = scanner.nextInt ();

        switch (num) {
            case 1:
                System.out.print("1-Janeiro");
                break;
            case 2:
                System.out.print("2-feveiro");
                break;
            case 3:
                System.out.print("3-Março");
                break;
            case 4:
                System.out.print("4-abril");
                break;
            case 5:
                System.out.print("5-maio");
                break;
            case 6:
                System.out.print("6-Junho");
                break;
            case 7:
                System.out.print("7-Julho");
                break;
            case 8:
                System.out.print("8-agosto");
                break;
            case 9:
                System.out.print("9-setembro");
                break;
            case 10:
                System.out.print("10-outubro");
                break;
            case 11:
                System.out.print("11-novembro");
                break;
            case 12:
                System.out.print("12-dezembro");
                break;
            default:
                System.out.print("Nenhuma das opções");
                
        }
    }
}

