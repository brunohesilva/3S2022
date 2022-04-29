package Java;

public class mainConta {
    
    public static void main(String[] args) {

        contaEmpresa contaE1 = new contaEmpresa();
        System.out.println(contaE1.getsaldoConta());
        contaE1.saqueConta(5000);
        System.out.println(contaE1.getsaldoConta());
        contaE1.emprestimo(7000);
        System.out.println(contaE1.getsaldoConta());

        Conta conta1 = new Conta();
        System.out.println(conta1.getsaldoConta());
        conta1.depositoConta(5000);
        System.out.println(conta1.getsaldoConta());
        
        contaPoupanca conta2 = new contaPoupanca();
        System.out.println(conta2.getsaldoConta());
        conta2.updateSaldo();
        System.out.println(conta2.getsaldoConta());

    }
}
