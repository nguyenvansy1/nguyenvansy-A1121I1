package ss15_DebugAndException.thuchanh;
import java.util.Scanner;
public class DebugInJava {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            int delta = (-b /a);
            System.out.println("Phương trình có nghiệm x = " + delta);
        }
    }
}