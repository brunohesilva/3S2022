package Java;
import java.util.Locale;
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangulo x, y;

    x = new Triangulo();
    y = new Triangulo();
    
    System.out.println("Entre com as medidas do triângulo X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    
    System.out.println("Entre com as medidas do triângulo Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = x.area();
    
    System.out.printf("Area do Triângulo X: %.4f%n", areaX);
    System.out.printf("Area do Triângulo Y: %.4f%n", areaY);

    if(areaX > areaY) {
      
      System.out.printf("Maior area: X");
      
    }else {
      
      System.out.printf("Maior area: Y");
      
    }
    
    sc.close();
    
  }
}