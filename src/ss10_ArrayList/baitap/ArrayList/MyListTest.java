package ss10_ArrayList.baitap.ArrayList;

import ss7_AbstractClassAndInterface.thuchanh.comparable.ComparableCircle;

import java.util.ArrayList;
import java.util.List;


public class MyListTest {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);
        list.remove(2);
        for (Integer s : list)
            System.out.print(s);
    }


}

