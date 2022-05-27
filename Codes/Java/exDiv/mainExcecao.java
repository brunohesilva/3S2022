package Java.exDiv;

public class mainExcecao {
    
    public static void main(String[] args){

        testaPar pt = new testaPar();

        try {
            pt.testasepar(5);
            
        } catch (Exception ex) {
            ex.getClass();
            ex.getMessage();
        }

    }

}
