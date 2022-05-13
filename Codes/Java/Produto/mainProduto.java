package Java.Produto;

import java.util.Locale;
import java.util.Scanner;

public class mainProduto {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Dados do produto: ");
        
        System.out.println("Nome: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade em estoqu: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: ");
        System.out.println(produto);
        
        System.out.println();
        System.out.print("Digite a quantidade de entrada do produto no estoue");
        int quantidade = sc.nextInt();
        produto.adicionaProduto(quantidade);
        
        System.out.println();
        System.out.println("Atulização do produto em estoque: ");
        System.out.println(produto);

        System.out.println();
        System.out.print("Digite a quantidade de saida do produto no estoue");
        quantidade = sc.nextInt();
        produto.retiraProduto(quantidade);
        
        System.out.println();
        System.out.println("Atulização do produto em estoque: ");
        System.out.println(produto);

        sc.close();

    }
}
