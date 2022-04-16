package CaseStudy.Models;

import CaseStudy.Models.Facility;

public class Villa extends Facility{
    private String roomStandard;
    private int areaPool;
    private int floor;

    public Villa(){

    }


    public Villa(int idFacility ,String serviceName, int area, int cost, int limitPeople,String rentalType,String roomStandard,int areaPool,int floor)
    {
        super(idFacility,serviceName, area, cost, limitPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "idFacility='" + getIdFacility() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area='" + getArea() + '\'' +
                ", cost='" + getCost()+ '\'' +
                ", limitPeople='" + getLimitPeople() + '\'' +
                ", rentalType='" + getRentalType()+ '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }


}
