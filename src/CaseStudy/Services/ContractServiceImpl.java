package CaseStudy.Services;

import CaseStudy.Models.Booking;
import CaseStudy.Models.Contract;
import CaseStudy.Models.Customer;

import java.sql.SQLOutput;
import java.util.*;

public class ContractServiceImpl implements ContractService{
    Scanner sc = new Scanner(System.in);
    static List<Contract> contractList = new ArrayList<Contract>();

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getIdCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin:" + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin:" + customer.toString());
            System.out.println("Nhập id hợp đồng: ");
            int idContact = sc.nextInt();
            System.out.println("Nhập số tiền trả trước");
            int deposit = sc.nextInt();
            System.out.println("Nhập số chi phí");
            int total = sc.nextInt();
            Contract contract = new Contract(idContact, booking.getIdBooking(), deposit, total, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công : " + contract.toString());
        }
    }
    @Override
    public void displayListContract() {
     for (Contract contract : contractList) {
    System.out.println(contract.toString());
}
    }

    @Override
    public void editContract() {

    }
}
