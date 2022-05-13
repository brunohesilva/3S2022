package Java.Loops;

public class whilex {
    
    public static void  main(String[] args) {

        int cont=0;
        int x=0;

        while (cont<10) {
            
            if (x % 3 == 0) {
                
                cont++;
                System.out.println(x);

            }
            x++;
        }
        System.out.println("FIM!");
    }
}
