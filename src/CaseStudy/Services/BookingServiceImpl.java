package CaseStudy.Services;

import CaseStudy.Models.Booking;
import CaseStudy.Models.BookingComparator;
import CaseStudy.Models.Customer;
import CaseStudy.Models.Facility;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static CaseStudy.Services.CustomerServiceImpl.customerLinkedList;
import static CaseStudy.Services.FacilityServiceImpl.facilityIntegerMap;

public class BookingServiceImpl implements BookingService{
    public static Scanner sc = new Scanner(System.in);
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    @Override
    public void addBooking() {
          int id=1;
          if (!bookingSet.isEmpty())
          {
              id = bookingSet.size();
          }
          Customer customer = chooseCustomer();
          Facility facility = chooseFacility();
          System.out.println("Nhập ngày bắt đầu thuê");
          String startDay = sc.nextLine();
          System.out.println("Nhập ngày trả phòng");
          String endDay = sc.nextLine();
          Booking booking = new Booking(id,startDay,endDay,customer,facility,facility.getIdFacility());
          bookingSet.add(booking);
          System.out.println("Đã booking thành công");
    }
    public Set<Booking> sendBooking() {
        return bookingSet;
    }
    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet){
            System.out.println(booking);
        }
    }

    public static Customer chooseCustomer(){
        System.out.println("Danh sách customer");
        for (Customer customer : customerLinkedList){
            System.out.println(customer);
        }

        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
        int id = Integer.parseInt(sc.nextLine());
        while(check){
            for (Customer customer :  customerLinkedList){
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Nhập lại id customer: ");
                id = Integer.parseInt(sc.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("Danh sách Facility");
        for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString() );
        }

        System.out.println("Nhập id dịch vụ: ");
        boolean check = true;
        int id = Integer.parseInt(sc.nextLine());
        while(check){
            for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
                if (id == entry.getKey().getIdFacility()){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Nhập lại id facility: ");
                id = Integer.parseInt(sc.nextLine());
            }
        }
        return null;
    }
}
