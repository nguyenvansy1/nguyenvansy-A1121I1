package ss11_Stack_Quene.baitap;

import java.util.Stack;

public class DaoNguocStack {
    public static void main(String[] args) {
        Stack<Integer> daoStack = new Stack<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            daoStack.push(arr[i]);
        }
       for (int i = 0; i < arr.length; i++) {
           arr[i] = daoStack.pop();
       }
        for (int i: arr) {
            System.out.print(i + "-" );
        }
        System.out.println("");

        Stack<String> daoStack1 = new Stack<>();
        String chuoi = "java string split method";
        String[] s1 = chuoi.split("\\s");
        for (int i = 0; i < s1.length; i++) {
            daoStack1.push(s1[i]);
        }
        for (int i = 0; i < s1.length; i++) {
            s1[i] = daoStack1.pop();
        }
        for (String i: s1) {
            System.out.print(i + "-");
        }
    }
}
