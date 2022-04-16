package ss3_MangVaPhuongThuc.thuchanh;
import java.util.Scanner;
public class GiaTriMin {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       return min ;

    }



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang :");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        for (int i=0;i<arr1.length;i++)
        {
            System.out.println("Nhap phan tu thu " + (i+1) + ":" );
            arr1[i] = sc.nextInt();
        }
       int min1 = findMin(arr1);
        System.out.println("Gia be nhat cua mang la :" + min1);
    }
}
