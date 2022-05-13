package Java.formasGeometricas;

public class trianguloEquilatero extends Forma {
    
    double lado;
    // private double altura;

    @Override 
    public double cArea(double valor) {

        Math.sqrt(3);
        return valor * valor / 4;

    }

    @Override
    public double cPerimetro(double valor) {

        return valor + valor + valor;

    }

    public void setLado( double valor) {

        this.lado = lado;
        super.area = cArea(lado);
        super.perimetro = cPerimetro(lado);
        
    }
}