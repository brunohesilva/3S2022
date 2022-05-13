package Java.Prova;
import java.util.Scanner;


public class Aluno {
    
    private String nome;
    private Integer ra;
    private String uc;
    private String turma;

    Scanner r = new Scanner(System.in);
    
    public Aluno() {

        this.nome = "Bruno Henrique Silva";
        this.ra = 347384;
        this.uc = "Programação de Soluções Computacionais";
        this.turma =  "Sistemas de Informação";

    }

    public String getnome () {
        return this.nome;
    }

    public Integer getra() {
        return this.ra;
    }

    public String getuc() {
        return this.uc;
    }

    public String getturma() {
        return this.turma;
    
    }

    public void Menu() {

        System.out.println("----------------------------");
        System.out.println("Bem-vindo ao Portal do Aluno");
        System.out.println("1 - Nome ");
        System.out.println("2 - RA ");
        System.out.println("3 - UC ");
        System.out.println("4 - Turma ");
        System.out.println("----------------------------");

        System.out.println("Digite uma opção: ");
        int op = r.nextInt();

        switch (op){
            
            case 1:

                validacao();
                System.out.println(this.nome);
                
            break;

            case 2:

                validacao();
                System.out.println(this.ra);


            break;

            case 3:

                validacao();
                System.out.println(this.uc);

            break;

            case 4:

                validacao();
                System.out.println(this.turma);

            break;
            
            default:

                System.out.println("Opção inválida");
                
            break;
        }
    }

    public void validacao() {

        Integer cont = 0;

        System.out.println("Informe a senha: ");
        String senha = r.next();
        
        for (Integer i= 0; i < 4; i++) {

            if(senha.equals("3473")) {

                cont = 0;
                break;

            } else {

                cont++;

                if (cont == 3) {

                    System.out.println("Limite de tentativas atingidas!");
                    System.exit(0);
                    break;

                } else {

                    System.out.println("Voce tentou" + "\n" + cont + "\n" + "vez(es).");
                    
                    System.out.println("Informe a senha: ");
                    senha = r.next();

                }
            }
        }

    }
}
