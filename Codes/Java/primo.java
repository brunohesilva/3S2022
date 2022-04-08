package Java;
import java.util.Scanner;


public class primo {
    
    public static void  main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Número");
        int num = ler.nextInt();

        for(int i = 1;i<=num;i++) {

            boolean primo = true;

            for(int j = 2;j<i;j++) {

                if(i%j == 0) {

                    primo = false;

                }

                if(primo) {

                    System.out.println(i);
                    
                }
            }
        }

    }
}

//import java.util.Scanner;

//public class EXC29 {

  //  public static void main(String[] args) {
        // TODO Auto-generated method stub
    //    Scanner scan = new Scanner(System.in);
        
      //  System.out.println("Entre com um numero ");
        //int num = scan.nextInt();
        
        //for(int i = 1;i<=num;i++) {
            
          //  boolean primo = true;
            
            //for(int j = 2;j<i;j++) {
                
              //  if(i%j == 0) {
                //    primo = false;
                //}
                
                //if(primo) {
                    //System.out.println(i);
                //}
            //}
            
        //}
    //}

//}
