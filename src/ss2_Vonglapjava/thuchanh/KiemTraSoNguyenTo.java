package ss2_Vonglapjava.thuchanh;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n :");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
        } else {
            for (int i = 2; i < n; i++)
                if (n % i == 0) {
                    isPrime = false;
                }
            if (isPrime) {
                System.out.println("Là số nguyên tố :");
            } else {
                System.out.println("Không phải là số nguyên tố");
            }

        }
    }
}
