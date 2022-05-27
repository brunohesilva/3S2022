package Java.exDiv;

public class testaPar{
    
    public boolean testasepar(double valor) throws Excecao{
        int temp = (int) valor;
        if((temp == valor) && (temp % 2 == 0 )) {
            return true;
        }
        else{
            throw new Excecao();
        }
    }

}
