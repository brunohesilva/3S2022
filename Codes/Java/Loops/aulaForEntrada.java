package Java.Loops;
import java.util.Scanner;

public class aulaForEntrada {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int num1, cont;
        do {
            System.out.println("Digite um número:");
            num1 = input.nextInt();

        }while(num1<1 || num1 >10);

        cont=0;
        while(cont<num1) {
             System.out.println(cont);
             cont++;
        }



        // cont=0;
        // while(cont<=num1) {

        //     System.out.println(cont);
        //     cont++;
        // }

        // for(cont=1;cont<=10;cont++) {
        //     resp = num1 * cont;
        //     System.out.println(num1 + " * " + cont + " = " + resp);
        // }

    }
}
