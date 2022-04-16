package ss15_DebugAndException.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        System.out.println("Nhập c:");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Không được nhập số âm");
        }



        if (a+b<= c ) {
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại");
        }
        else
        {       if (a+c<= b)
                    throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại");
                else
                    if (b+c<= a)
                         throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại");

        }




    }
}

