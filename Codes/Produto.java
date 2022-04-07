package Java;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {

        return preco * quantidade;

    }

    public void adicionaProduto(int quantidade) {

        this.quantidade += quantidade;

    }

    public void retiraProduto(int quantidade) {

        this.quantidade -= quantidade;

    }

    public String toString() {
        
        return nome
        + ", R$."
        + String.format("%.2f",preco)
        + ", "
        + this.quantidade
        + " unidades, Total: R$. "
        + String.format("%.2f",valorTotalEstoque());

    }
    
}
