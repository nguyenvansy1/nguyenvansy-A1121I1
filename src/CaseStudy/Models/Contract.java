package CaseStudy.Models;

public class Contract {
    private int idContact;
    private int deposit;
    private int totalMoney;
    private Customer idCustomer;
    private int idBooking;
    public Contract(){

    }


    public Contract(int idContact,int idBooking, int deposit, int totalMoney, Customer idCustomer) {
        this.idContact = idContact;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
        this.idBooking = idBooking;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int total_money) {
        this.totalMoney = totalMoney;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContact=" + idContact +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", idCustomer=" + idCustomer +
                ", idBooking=" + idBooking +
                '}';
    }
}
