package ss1_IntroductiontoJava.baitap;
import  java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD :");
        int uSD = sc.nextInt();
        int rate = uSD*23000;

        System.out.println("Giá trị VND :" +rate);

    }
}
