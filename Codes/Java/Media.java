package Java;
public class Media {
    
    private double A1;
    private double A2;
    private double A3;
    private double mediaFinal; 

    public Media () {

        this.A1=0;
        this.A2=0;
        this.A3=0;

    };

    public double getA1() {return this.A1;}
    public void setA1(double A1){this.A1=A1;}
    
    public double getA2() {return this.A2;}
    public void setA2(double A2){this.A2=A2;}
    
    public double getA3() {return this.A3;}
    public void setA3(double A3){this.A3=A3;}
    
    public double getmediaFinal() {

        calculo();
        return this.mediaFinal;

    }

    private void calculo() {

        this.mediaFinal=(this.A1*0.3)+(this.A2*0.3)+(this.A3*0.4);

    }

    public void score() {
        calculo();
        if(this.mediaFinal >=7.0) {

            System.out.println("Aprovado");

        } else if(this.mediaFinal<5.0) {

            System.out.println("Reprovado");

        } else {

            System.out.println("Prova final");

        }
    }

    public void historico() {

        System.out.println("A1= " +this.A1);
        System.out.println("A2= " +this.A2);
        System.out.println("A3= " +this.A3);
        System.out.println("Média= " +this.mediaFinal);

    }
       
}
