package Test;

import java.util.Scanner;

public class Test{

    public static void main(String args[]){
        String string = "10-10-2021";
        String[] splits = string.split("-");
        for (int i=0;i<splits.length;i++)
        {
            System.out.println(splits[i]);
        }
    }
}