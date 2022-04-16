package ss3_MangVaPhuongThuc.baitap;
import java.sql.SQLOutput;
import  java.util.Scanner;
public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử cho mảng :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<size)
        {
            System.out.println("Nhập phần tử thứ " +  (i+1));
            arr[i] = sc.nextInt();
            i++;
        }
       int min = arr[0];
        for (int j = 1 ; j< arr.length;j++)
        {

            if (arr[j]< min)
            {
                min = arr[j];
            }

        }
        System.out.println("Giá trị nhỏ nhất của mảng là :" + min);


    }
}
