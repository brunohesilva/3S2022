package Java.Interface;

public class Invoice {

    private Double basicPayment;
    private Double tax;

    public Invoice() {

    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getbasicPayment(){
        return basicPayment;
    }
    public Double getTax(){
        return tax;
    }

    public void setbasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public void setTaxt(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return getbasicPayment() + getTax();
    }
}

