package CaseStudy.Models;


public class Booking {
    private int idBooking;
    private String startDay ;
    private String endDay ;
    private Customer idCustomer;
    private Facility serviceName;;
    private int idService;

    public Booking() {

    }

    public Booking(int idBooking, String startDay, String endDay,Customer idCustomer, Facility serviceName,int idService){
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.serviceName = serviceName;
        this.idService = idService;
        this.idCustomer = idCustomer;
    }


    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Facility getServiceName() {
        return serviceName;
    }

    public void setServiceName(Facility serviceName) {
        this.serviceName = serviceName;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", idCustomer=" + idCustomer +
                ", serviceName=" + serviceName +
                ", idService=" + idService +
                '}';
    }
}
