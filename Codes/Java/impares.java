package Java;

public class impares {

    public static void  main(String[] args) {

        int impar=0;

        for (int i = 0; impar < 20; i++) {
            if( i % 2 == 1){
                System.out.println(i);
                impar++;
            }
        }

        
        System.out.println("FIM!");
    }
}



