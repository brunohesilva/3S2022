package Java;
import java.util.Scanner;


public class contagemRegressiva{
    
    public static void  main(String[] args) {
        
        double x=0;
        double y=0;
        double n=0;

        Scanner ler = new Scanner(System.in);

        System.out.println("x");
        x = ler.nextDouble();

        System.out.println("y");
        y = ler.nextDouble();

        System.out.println("n");
        n = ler.nextDouble();

        for (double i=x; i<=y; i=i+n ){
            System.out.println(i);

        }
    }
}
