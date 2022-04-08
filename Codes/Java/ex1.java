package Java;
import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o concito do aluno: ");
        String conceito = ler.nextLine();

        conceito = conceito.toLowerCase();

        switch(conceito)
        {
            case "a":
                System.out.println("Excelente!");
            break;    
            case "b":
                System.out.println("Ótimo!");
            break;
            case "c":
                System.out.println("Bom");
            break;
            case "d":
                System.out.println("Regular");
            break;
            case "e":
                System.out.println("Ruim");
            break;
            case "f":
                System.out.println("Reprovado");
            break;
            default:
                System.out.printf("Não conheço o conceito %s \n",conceito);
            break;
        }

        System.out.println("fim");
    }
}
