package SelfLearning.Test1;


import CaseStudy.test.test;

import java.util.Scanner;

public class TryCatch {
    public static void test() throws NumberException  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng :");

        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (Character a : arr) {
            System.out.println(a);
        }


        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch < 48 || ch > 57) {
                throw new NumberException("Không phải số");
            }
            break;
        }


    }

    public static void main(String[] args) throws NumberException {
        test();
    }
}
