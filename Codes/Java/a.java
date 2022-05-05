package Java;
import java.util.Scanner;

public class a {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); // define o metódo para a entranda da resposta do usuário

        Integer tamanho = 10; // variável para o tamanho do vetor
        Integer ra[] = new Integer[tamanho]; // declarando o vetor
        Integer indice; // variável necessária para o posicionamento do vetor 

        for (indice=0; indice<tamanho; indice++) { // loop de repetição para a entranda de dados no vetor

            System.out.printf("Informe o RA: ",(indice+1), tamanho); // requisição de dados para o usuário, adiciona mais um para mudar a posição no vetor de acordo com o tamnaho definido anteriomente
            ra[indice] = read.nextInt(); // captação dos dados fornecidos pelo usuário e armazenamento com o índice no vetor
            
        }
    }
}
