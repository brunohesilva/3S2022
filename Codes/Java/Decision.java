package Java;
import java.util.Scanner;

public class Decision {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int num1; 
        int num2; 
        //int soma; 

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2) {

            System.out.println(num1 +" é maior que " + num2);
            
        } else {
            
            System.out.println(num2 +" é maior que " + num1);

        }

        //soma = num1 + num2;

        //System.out.println("Soma = " + soma );

    }

}