package Java;
import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("digite uuma letra a ser testada");
        String letra = ler.nextLine();

        letra = letra.toUpperCase();

        switch(letra)
        {
            case "A":
                System.out.println("Você digitou uma vogal");
            break;
            case "E":
                System.out.println("Você digitou uma vogal");
            break;
            case "I":
                System.out.println("Você digitou uma vogal");
            break;
            case "O":
                System.out.println("Você digitou uma vogal");
            break;
            case "U":
                System.out.println("Você digitou uma vogal");
            break;
            default:
                System.out.println("Você digitou uma consoante");
                break;
            }

            System.out.println("FIM");

    }
}
