package Java;

public class Cadastro {
    private String nome;
    private int cpf;
    private String nomeMae;
    private double altura;
    private double peso;
    private int idade;
    private int dataNascimento;
    public String genero;

    public Cadastro(String nome, String nomeMae, String genero, int cpf, double altura, double peso, int idade, int dataNascimento) {

    }

    public Cadastro() {

        this.nome=nome;
        this.nomeMae=genero;
        this.genero=genero;
        this.cpf=0;
        this.altura=0;
        this.peso=0;
        this.idade=0;
        this.dataNascimento=0;

    }


    public int getcpf(){
        return cpf;
    }
    public void setcpf(int cpf) {
        this.cpf = cpf;
    }
    public double getaltura(){
        return altura;
    }
    public void setaltura(double altura) {
        this.altura = altura;
    }
    public double getpeso(){
        return peso;
    }
    public void setpeso(double peso) {
        this.peso = peso;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public int getdataNascimento(){
        return dataNascimento;
    }
    public void setdataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getnomeMae(){
        return nomeMae;
    }
    public void setnomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getgenero(){
        return genero;
    }
    public void setgenero(String genero) {
        this.genero = genero;
    }
}
