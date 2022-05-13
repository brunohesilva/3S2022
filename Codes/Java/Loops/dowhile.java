package Java.Loops;
import java.util.Scanner;


public class dowhile {
    
    public static void  main(String[] args) {

        double op=0;

        Scanner ler = new Scanner(System.in);

        do {
            
            System.out.println("Digite um número e 0 para parar");
            op = ler.nextDouble();

        } while (op != 0);

        System.out.println("FIM!");

    }
}
