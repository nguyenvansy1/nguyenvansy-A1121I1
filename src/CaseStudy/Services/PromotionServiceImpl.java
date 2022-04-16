package CaseStudy.Services;



import CaseStudy.Models.Booking;

import java.util.Scanner;


public class PromotionServiceImpl extends  BookingServiceImpl {
    public static Scanner sc = new Scanner(System.in);

    public void displayCustomerInYear() {
        System.out.println("Nhập năm sử dụng dịch vụ: ");
        String year = sc.nextLine();
        for (Booking booking : bookingSet) {
            String[] splits = booking.getStartDay().split("-");
            for (int i=0;i<splits.length;i++){
                if (year.equals(splits[i]))
                {
                    System.out.println(booking.toString());
                }
            }
        }
    }
}
