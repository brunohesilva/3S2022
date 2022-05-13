package Java.Decisao;
import java.util.Scanner;

public class MeuSwitch {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número:");
        int numero = ler.nextInt();

        // if (numero == 1)
        // {
        //     System.out.println("Você digitou um");
        // }
        // else if (numero == 2)
        // {
        //     System.out.println("Você digitou dois");
        // }
        // else if (numero == 3)
        // {
        //     System.out.println("Você digitou o três");
        // }
        // else if (numero == 4)
        // {
        //     System.out.println("Você digitou o quatro");
        // }
        // else 
        // {
        //     System.out.println("Não conheço esse número");
        // }

        switch (numero) 
        {
            case 1:
                System.out.println("Você digitou o um");
            break;
            case 2:
                System.out.println("Você digitou o dois");
            break;
            case 3:
                System.out.println("Você digitou o três");
            break;
            case 4:
                System.out.println("Você digitou o quatro");
            break;
            default:
                System.out.println("Não conheço esse número");
            break;
        }

        System.out.println("Fim do código!");

    }
}
