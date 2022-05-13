package Java.formasGeometricas;

public class Circulo extends Forma {

    double raio;
    final double PI = 3.14;

    @Override
    public double cArea(double valor) {

        return PI * valor * valor;

    }

    @Override
    public double cPerimetro(double valor) {

        return 2.0 * PI * valor;

    }

    public void setRaio( double valor) {
        this.raio = raio;
        super.area = cArea(raio);
        super.perimetro = cPerimetro(raio);
    }
}
