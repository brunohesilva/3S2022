package Java.Interface;
import java.util.Date;

public class CarRental {
    private Date start;
    private Date finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){

    }

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.finish = finish;
        this.start = start;
    }

    public Date getstart(){
        return start;
    }

    public void setstart(Date start) {
        this.start = start;
    }

    public Date getfinish(){
        return finish;
    }

    public void setfinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehiclet(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice(){
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
