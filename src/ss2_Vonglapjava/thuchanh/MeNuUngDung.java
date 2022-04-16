package ss2_Vonglapjava.thuchanh;
import java.util.Scanner;

public class MeNuUngDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 6; i++) {
                        for (int j=6;j>i ; j--){
                             System.out.print("*");
                         }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j=6;j>0 ; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        for (int j=6;j>0 ; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                   break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
             }
        }
    }
}
