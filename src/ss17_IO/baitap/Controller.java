package ss17_IO.baitap;

import ss12_JavaCollectionFramework.baitap.UseArrayListAndLinkedList.Product;

import java.util.List;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {

        int choice = -1;
        while (choice != 0) {
            System.out.println("----------Menu----------");
            System.out.println("1.\tAdd product in file");
            System.out.println("2.\tDisplay product");
            System.out.println("3.\tSearch product");
            System.out.println("4.\tExit");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            FileBinaryUtils file = new FileBinaryUtils();
            switch (choice) {
                case 1: file.addProductList("D:\\A1121I1-NguyenVanSy\\Module 2\\data1.txt");
                break;
                case 2:
                        file.displayFile("D:\\A1121I1-NguyenVanSy\\Module 2\\data1.txt");
                case 3:

                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

}
