package Java.exDiv;

public class divisao {

    public divisao () {
        this.n1=0;
        this.n2=0;
        this.div=0;
    }


    
    private double n1;
    private double n2;
    private double div;

    public double getn1() {return this.n1;}
    public void setn1(double n1){this.n1=n1;}

    public double getn2() {return this.n2;}
    public void setn2(double n2){this.n2=n2;}
    
    public double getdiv() {return this.div;}
    public void setdiv(double div){this.div=div;}


    public double divide() {
        return this.div = this.n1 / this.n2;
    }


}