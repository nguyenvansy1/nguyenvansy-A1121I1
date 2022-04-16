package ss3_MangVaPhuongThuc.baitap;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int[] arr2= new int[arr.length+1];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vi tri can them");
        int position = sc.nextInt();

        if (position < 0 || position >= arr.length) {
            System.out.println("Khong the chen phan tu vao mang");
        } else
        {
            System.out.println("Nhap so can them");
            for (int i = 0; i<arr.length;i++)
            {
                arr2[i]= arr[i];
            }
            int x = sc.nextInt();
            for (int i = arr2.length-1; i > position; i--) {
                arr2[i] = arr2[i-1];

            }
            arr2[position] = x ;
            for (int i = 0;i< arr2.length;i++)
            {
                System.out.print(arr2[i]+ " ");
            }
        }


  }
}



