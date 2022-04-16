package CaseStudy.controllers;

import CaseStudy.Models.Employee;
import CaseStudy.Models.Facility;
import CaseStudy.Services.*;
import SelfLearning.Test1.NumberException;

import java.util.Scanner;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      displayMenu();
    }

    public static void displayMenu() {

        int choice = -1;
        while (choice != 0) {
            System.out.println("----------Menu----------");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e)
            {
                System.out.println("Nhập sai vui lòng nhập lại số: ");
                continue;
            }


            switch (choice) {
                case 1: displayEmployeeManagement();
                break;
                case 2: displayCustomerManagement();
                break;
                case 3: displayFacilityManagement();
                break;
                case 4: displayBookingManagement();
                break;
                case 5:displayPromotionManagement();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    choice = -1;
            }
        }
    }



        public static void displayEmployeeManagement() {
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            int choiceChildFunction = -1;
            while (choiceChildFunction != 0) {
                System.out.println("1.\tDisplay list employees");
                System.out.println("2.\tAdd new employee");
                System.out.println("3.\tEdit employee");
                System.out.println("4.\tDelete employee");
                System.out.println("5.\tSearch employee");
                System.out.println("6.\tReturn main menu");
                System.out.println("---------------------------");
                System.out.println("Select choice :");
                try {
                    choiceChildFunction = Integer.parseInt(sc.nextLine());
                }catch (Exception e)
                {
                    System.out.println("Nhập sai vui lòng nhập lại số: ");
                    continue;
                }
                switch (choiceChildFunction) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.addNew();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        employeeService.delete();
                        break;
                    case 5:
                        employeeService.search();
                        break;
                    case 6:
                        displayMenu();
                    default:
                        System.out.println("No choice!");
                        choiceChildFunction = -1;
                }
            }
        }
        public static void displayCustomerManagement(){
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            int choiceChildFunction = -1;
            while (choiceChildFunction != 0) {
                System.out.println("1.\tDisplay list customers");
                System.out.println("2.\tAdd new customer");
                System.out.println("3.\tEdit customer");
                System.out.println("4.\tReturn main menu");
                System.out.println("---------------------------");
                System.out.println("Select choice :");
                try {
                    choiceChildFunction = Integer.parseInt(sc.nextLine());
                }catch (Exception e)
                {
                    System.out.println("Nhập sai vui lòng nhập lại số: ");
                    continue;
                }
                switch (choiceChildFunction) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.addNew();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                       displayMenu();
                       break;
                    default:
                        System.out.println("No choice!");
                        choiceChildFunction = -1;
                }
            }
        }

        public static void displayFacilityManagement() {
            FacilityServiceImpl facilityService = new FacilityServiceImpl();
            int choiceChildFunction = -1;
            while (choiceChildFunction != 0) {
                System.out.println("1.\tDisplay list facility");
                System.out.println("2.\tAdd new facility");
                System.out.println("3.\tDisplay list facility maintenance");
                System.out.println("4.\tReturn main menu");
                System.out.println("---------------------------");
                System.out.println("Select choice :");
                try {
                    choiceChildFunction = Integer.parseInt(sc.nextLine());
                }catch (Exception e)
                {
                    System.out.println("Nhập sai vui lòng nhập lại số: ");
                    continue;
                }
                switch (choiceChildFunction) {
                    case 1: facilityService.display();
                    break;
                    case 2: addNewFacilityMenu();
                    break;
                    case 3:
                        break;
                    case 4:displayMenu();
                    break;
                    default:
                        System.out.println("No choice!");
                        choiceChildFunction = -1;
                }
            }
        }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choiceChildFunction = -1;
        while (choiceChildFunction != 0) {
            System.out.println("1.\tAdd new Villa");
            System.out.println("2.\tAdd new House");
            System.out.println("3.\tAdd new Room");
            System.out.println("4.\tReturn main menu");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            try {
                choiceChildFunction = Integer.parseInt(sc.nextLine());
            }catch (Exception e)
            {
                System.out.println("Nhập sai vui lòng nhập lại số: ");
                continue;
            }
            switch (choiceChildFunction) {
                case 1: facilityService.addNewVilla();
                break;
                case 2: facilityService.addNewHouse();
                break;
                case 3: facilityService.addNewRoom();
                break;
                case 4: displayFacilityManagement();
                break;
                default:
                    System.out.println("No choice!");
                    choiceChildFunction = -1;
            }
        }
    }


        public static void displayBookingManagement(){
            BookingServiceImpl booking = new BookingServiceImpl();
            ContractServiceImpl contract = new ContractServiceImpl();
            int choiceChildFunction = -1;
            while (choiceChildFunction != 0) {
                System.out.println("1.\tAdd new booking");
                System.out.println("2.\tDisplay list booking");
                System.out.println("3.\tCreate new contracts");
                System.out.println("4.\tDisplay list contracts");
                System.out.println("5.\tEdit contracts");
                System.out.println("6.\tReturn main menu");
                System.out.println("Select choice :");
                try {
                    choiceChildFunction = Integer.parseInt(sc.nextLine());
                }catch (Exception e)
                {
                    System.out.println("Nhập sai vui lòng nhập lại số: ");
                    continue;
                }
                switch (choiceChildFunction) {
                    case 1: booking.addBooking();
                    break;
                    case 2: booking.displayListBooking();
                    break;
                    case 3: contract.createNewContract();
                    break;
                    case 4: contract.displayListContract();
                    break;
                    case 6: displayMenu();
                    break;
                    default:
                        System.out.println("No choice!");
                        choiceChildFunction = -1;

                }
            }
        }


        public static void  displayPromotionManagement(){
            PromotionServiceImpl promotionService = new PromotionServiceImpl();
            int choiceChildFunction = -1;
            while (choiceChildFunction != 0) {
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                System.out.println("Select choice :");
                try {
                    choiceChildFunction = Integer.parseInt(sc.nextLine());
                }catch (Exception e)
                {
                    System.out.println("Nhập sai vui lòng nhập lại số: ");
                    continue;
                }
                switch (choiceChildFunction) {
                    case 1:promotionService.displayCustomerInYear();
                    break;
                    case 2:
                        break;
                    case 3: displayMenu();
                    break;
                    default:
                        System.out.println("No choice!");
                        choiceChildFunction = -1;

                }
            }
        }


}