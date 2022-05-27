package Java.exDiv;

import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        double soma = 0;


        try {
            
            do
            {
                System.out.println("Digite um número ");
                soma = soma + sc.nextDouble();
            } while (true);
        } catch (Exception e) {
            System.out.println("Voce parou");
        }

        System.out.println("A soma :" + soma);
        sc.close();
    }


}
