package Java;
import java.util.Scanner;

public class Revisao {
    
    private int soma;
    private double media;
    private int n[] = new int[10];
    
    public Revisao() {
        this.media = 0;
        this.soma = 0;
    }
    
    public Revisao(int[] vector) {
        this.soma = 0;
        this.media = 0;
        this.n = vector;
    }
    
    public void setn ( int n[]) {
        this.n = n;
    }

    public int getsoma() {
        return this.soma;
    }

    public double getmedia() {
        return this.media;
    }

    public int[] getn() {
        return this.n;
    }
    
    public void impares() {
        
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um número:");
            this.n[i] = ler.nextInt();
               
        }
        
    }

    public boolean impar(int valor) {
        if(valor % 2 == 1 ){
            return true;
        } else {
            return false;
        }
    }

    public int somaImpar() {

        this.soma=0;

        for (int i = 0; i<10; i++){
            
            if (impar(n[i])){
                soma = soma + n[i];
            }
        }
        return soma;
    }

    public double mediaImpar() {

        int numero = 0;
        this.soma = 0;
        this.media = 0;

        for(int i = 0; i<10; i++) {

            if(impar(n[i])) {
                soma = soma + n[i];
                numero++;
            
            }
        }

        media = soma / numero;
        return media;
    }
}
