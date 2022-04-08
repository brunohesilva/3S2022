package Java;
import java.util.Scanner;


public class multiplos {

    public static void  main(String[] args) {

        int num1 =0;
        int num2 =0;
        int cont=0;


        Scanner ler = new Scanner(System.in);

        System.out.println("num1");
        num1 = ler.nextInt();

        System.out.println("num2");
        num2 = ler.nextInt();

        while (num1 <= num2) {
            if (num1 % 7 == 0) {
                cont++;
                System.out.println(num1);
            }
            num1++;
        }
        System.out.println("FIM!");


    }
}
