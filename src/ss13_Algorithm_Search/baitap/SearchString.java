package ss13_Algorithm_Search.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String string = scanner.nextLine();


        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        System.out.println(list.get(0));
    }
}
