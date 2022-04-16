package ss11_Stack_Quene.baitap;

import java.util.HashMap;
import java.util.Map;

public class Stack{
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('a',4);
        System.out.println("Dem so lan xuat hien trong chuoi:");
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("Ky tu " + entry.getKey() + " xuat hien " + entry.getValue() + " lan.");
        }
    }

}
