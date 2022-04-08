package Java;
import java.util.Scanner;

public class variosIfs {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );

        int num1; 
        int num2;
        int soma;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        // if (num1 == num2) {
        //     System.out.println(num1 +" é igual a " + num2);
        // }
        // if (num1 != num2) {
        //     System.out.println(num1 +" é difernete de " + num2);
        // }
        // if (num1 > num2) {
        //     System.out.println(num1 +" é maior que " + num2);
        // }
        // if (num1 < num2) {
        //     System.out.println(num1 +" é menor que " + num2);
        // }
        // if (num1 >= num2) {
        //     System.out.println(num1 +" é maior ou igual a " + num2);
        // }
        // if (num1 <= num2) {
        //     System.out.println(num1 +" é menor ou igual a " + num2);
        // }

        // if(soma  >= 1000) {
        //     System.out.println("Você ganhou o prêmio!");
        // }else {
        //     System.out.println("Não foi desssa vez!");
        // }

        if(soma >= 1000) {
            System.out.println("Você ganhou o prêmio!");
        }else if(soma >= 500 && soma < 1000){
            soma += soma + 20000;
            System.out.println("Vocpê ganhou o prêmio de consolação, parábens: "+ soma);
        }else{
            System.out.println("Não foi dessa vez!");
        }
    }
}
                          