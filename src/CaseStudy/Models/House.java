package CaseStudy.Models;

public class House extends Facility{
    private String roomStandard;
    private int floor;


    public House(){

    }

    public House(int idFacility,String serviceName, int area, int cost, int limitPeople,String rentalType,String roomStandard,int floor)
    {
        super(idFacility,serviceName, area, cost, limitPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Override
    public String toString() {
        return "House{" +
                "idFacility='" + getIdFacility() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area='" + getArea() + '\'' +
                ", cost='" + getCost()+ '\'' +
                ", limitPeople='" + getLimitPeople() + '\'' +
                ", rentalType='" + getRentalType()+ '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
