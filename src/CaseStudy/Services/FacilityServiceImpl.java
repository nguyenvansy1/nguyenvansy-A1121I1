package CaseStudy.Services;

import CaseStudy.Models.*;
import FinalExamModule2.util.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl<fa> implements FacilityService{
    public static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);
    public static final String REGEX_ID_VILLA = "(SVVL)[-](\\d){4}";
    @Override
    public void display() {
      Set<Facility> facilitySet = facilityIntegerMap.keySet();
      for (Facility facility : facilitySet){
          System.out.println("Service:" + facility + ":" + facilityIntegerMap.get(facility));
      }
    }

    @Override
    public void displayMaintain() {

    }
    //String serviceName, int area, int cost, int limitPeople,String rentalType,String roomStandard,int areaPool,int floor
    @Override
    public void addNewVilla() {
        System.out.println("Nhập idFacility:");
        int idFacility = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập serviceName:");
        String serviceName = sc.nextLine();
        System.out.println("Nhập area:");
        int area = sc.nextInt();
        System.out.println("Nhập cost:");
        int cost = sc.nextInt();
        System.out.println("Nhập limitPeople:");
        int limitPeople = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập rentalType:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập roomStandard:");
        String roomStandard = sc.nextLine();
        System.out.println("Nhập areaPool:");
        int areaPool = sc.nextInt();
        System.out.println("Nhập floor:");
        int floor= sc.nextInt();
        sc.nextLine();
        facilityIntegerMap.put(new Villa(idFacility,serviceName, area, cost, limitPeople, rentalType, roomStandard, areaPool,floor),0);
    }

    public String inputID(){
        System.out.println("Nhập idFacility ");
        return Regex.regexStr(sc.nextLine(),REGEX_ID_VILLA,"Nhập sai định dạng vui lòng nhập lại: ");
    }
//String serviceName, int area, int cost, int limitPeople,String rentalType,String roomStandard,int floor
    @Override
    public void addNewHouse() {
        System.out.println("Nhập idFacility:");
        int idFacility = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập serviceName:");
        String serviceName = sc.nextLine();
        System.out.println("Nhập area:");
        int area = sc.nextInt();
        System.out.println("Nhập cost:");
        int cost = sc.nextInt();
        System.out.println("Nhập limitPeople:");
        int limitPeople = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập rentalType:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập roomStandard:");
        String roomStandard = sc.nextLine();
        System.out.println("Nhập floor:");
        int floor= sc.nextInt();
        sc.nextLine();
        facilityIntegerMap.put(new House(idFacility,serviceName, area, cost, limitPeople, rentalType, roomStandard,floor),0);
    }
//String serviceName, int area, int cost, int limitPeople,String rentalType,String freeService
    @Override
    public void addNewRoom() {
        System.out.println("Nhập idFacility:");
        int idFacility = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập serviceName:");
        String serviceName = sc.nextLine();
        System.out.println("Nhập area:");
        int area = sc.nextInt();
        System.out.println("Nhập cost:");
        int cost = sc.nextInt();
        System.out.println("Nhập limitPeople:");
        int limitPeople = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập rentalType:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập freeService:");
        String freeService = sc.nextLine();


        facilityIntegerMap.put(new Room(idFacility,serviceName, area, cost, limitPeople, rentalType, freeService),0);
    }
}

