package CaseStudy.Models;

public class Customer extends Person{
    private String typeGuest ;
    private String address ;

    public Customer(){

    }

    public Customer(int id,String name, int age, String gender,int cmnd, String numberphone,String email,String typeGuest, String address)
    {
        super(id,name,age,gender,cmnd,numberphone,email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", cmnd='" + getCmnd() + '\'' +
                ", numberphone='" + getNumberphone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
