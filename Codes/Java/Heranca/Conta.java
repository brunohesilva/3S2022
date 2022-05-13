package Java.Heranca;

public class Conta {

    private Integer nroConta;
    private String titularConta;
    protected double saldoConta;

    public Conta() {

    }

    public Conta(Integer nroConta, String titularConta, double saldoConta) {
        super();
        this.nroConta = nroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    public Integer getnroConta() {
        return nroConta;
    }

    public void setnroConta ( Integer nroConta) {
        this.nroConta = nroConta;
    }

    public String gettitularConta() {
        return titularConta;
    }

    public void settitularConta ( String titularConta) {
        this.titularConta = titularConta;
    }

    public double getsaldoConta() {
        return saldoConta;
    }

    // public void setsaldoConta ( double saldoConta) {
    //     this.saldoConta = saldoConta;
    // }

    public void saqueConta(double montante) {
        saldoConta-=montante;
    }

    public void depositoConta(double montante) {
        saldoConta+=montante;
    }

}


