package Java.formasGeometricas;

public class Quadrado extends Forma{

    double lado;

    @Override
    public double cArea(double valor) {

        return valor * valor;

    }

    @Override
    public double cPerimetro(double valor) {

        return lado * 4.0;

    }

    public void setLado( double valor) {
        this.lado = lado;
        super.area = cArea(lado);
        super.perimetro = cPerimetro(lado);
    }

}
