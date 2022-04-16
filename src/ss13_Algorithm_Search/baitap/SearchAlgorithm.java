package ss13_Algorithm_Search.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String string = input.nextLine();

        ArrayList<Character> maxList = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size()-1)) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
            list.clear();
        }

        for (Character ch: maxList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

