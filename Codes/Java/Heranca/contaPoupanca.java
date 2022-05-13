package Java.Heranca;

public class contaPoupanca extends Conta{

    private double taxaJuros;

    public contaPoupanca() {
        super();
    }

    public contaPoupanca(Integer nroConta, String titularConta, double saldoConta, double taxaJuros) {
        super(nroConta, titularConta, saldoConta);
        this.taxaJuros = taxaJuros;
    }

    public double settaxaJuros() {
        return taxaJuros;
    }

    public void settaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void updateSaldo() {
        saldoConta += saldoConta + taxaJuros;
    }
    
}
