package CaseStudy.Models;

public  abstract class Facility {
    private int idFacility;
    private String serviceName ;
    private int area ;
    private int cost ;
    private int limitPeople ;
    private String rentalType ;

    public Facility(){

    }

    public Facility(int idFacility ,String serviceName, int area, int cost, int limitPeople,String rentalType) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.limitPeople = limitPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(int idFacility) {
        this.idFacility = idFacility;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLimitPeople() {
        return limitPeople;
    }

    public void setLimitPeople(int limitPeople) {
        this.limitPeople = limitPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
