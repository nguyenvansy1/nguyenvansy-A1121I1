package CaseStudy.Models;

public class Room extends Facility {
    private String freeService ;

    public Room(){

    }

    public Room(int idFacility,String serviceName, int area, int cost, int limitPeople,String rentalType,String freeService)
    {
        super(idFacility,serviceName, area, cost, limitPeople, rentalType);
       this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idFacility='" + getIdFacility()+ '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area='" + getArea() + '\'' +
                ", cost='" + getCost()+ '\'' +
                ", limitPeople='" + getLimitPeople() + '\'' +
                ", rentalType='" + getRentalType()+ '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
