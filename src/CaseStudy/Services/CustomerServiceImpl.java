package CaseStudy.Services;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService{

    public static List<Customer> customerLinkedList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customerLinkedList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {

        System.out.println("Nhập id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập name:");
        String name = sc.nextLine();
        System.out.println("Nhập age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập gender:");
        String gender = sc.nextLine();
        System.out.println("Nhập cmnd:");
        int cmnd = sc.nextInt();
        System.out.println("Nhập numberphone:");
        String numberPhone = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập typeGuest:");
        String typeGuest = sc.nextLine();
        System.out.println("Nhập address:");
        String address = sc.nextLine();
        customerLinkedList.add(new Customer(id,name,age,gender,cmnd,numberPhone,email, typeGuest,address));



    }

    @Override
    public void edit() {
        System.out.println("Nhập vị trí nhân viên cần edit :");
        int indexEdit = sc.nextInt();

        for (int i=0; i<= customerLinkedList.size();i++)
        {
            if (customerLinkedList.get(i).getId()==indexEdit)
            {
                System.out.println("Nhập id:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập name:");
                String name = sc.nextLine();
                System.out.println("Nhập age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập gender:");
                String gender = sc.nextLine();
                System.out.println("Nhập cmnd:");
                int cmnd = sc.nextInt();
                System.out.println("Nhập numberphone:");
                String numberPhone = sc.nextLine();
                System.out.println("Nhập email:");
                String email = sc.nextLine();
                System.out.println("Nhập typeGuest:");
                String typeGuest = sc.nextLine();
                System.out.println("Nhập address:");
                String address = sc.nextLine();
                customerLinkedList.set(indexEdit,new Customer(id,name,age,gender,cmnd,numberPhone,email, typeGuest,address));

            }

        }

    }

    @Override
    public void delete() {

    }
}
