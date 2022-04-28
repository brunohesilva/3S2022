package Java;

public class contaEmpresa extends Conta{
    
    private double limiteCredito;

    public contaEmpresa() {
        super();
    }

    public contaEmpresa( Integer nroConta, String titularConta, double saldoConta, double limiteCredito) {
        super(nroConta, titularConta, saldoConta);
        this.limiteCredito = limiteCredito;
    }

    public double getlimiteCredito() {
        return limiteCredito;
    }

    public void setlimiteCredito (double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void emprestimo(double montante) {

        if(montante <= limiteCredito) {
            
            saldoConta+=limiteCredito - 100.0;
        }
        // @Override
        // public void saqueConta(double montante) {

        //     super.saqueConta(montante);
        //     saldoConta-=10.0;

        // }
    }

}