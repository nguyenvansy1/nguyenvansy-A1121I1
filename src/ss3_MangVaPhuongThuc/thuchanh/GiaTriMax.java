package ss3_MangVaPhuongThuc.thuchanh;
import java.util.Scanner;
public class GiaTriMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print("Nhập phần tử thứ "+ (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng :" +max);
    }
}
