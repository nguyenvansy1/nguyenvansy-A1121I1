package ss13_Algorithm_Search.thuchanh;

import java.util.Arrays;
import java.util.Random;

public class DemoSearch {
   public static void main(String[] args) {
//        int[] array = new int[100000000];
//        int length = array.length;
//        Random random = new Random();
//        for (int i = 0; i < length; i++) {
//            array[i] = random.nextInt(100000000);
//        }
          int[] array = {0,0,7,7,8,10,16,18,21,24,28,28,29,30,35,38,38,43,46,49};
//        Arrays.sort(array);
//        String str = "0\t0\t7\t7\t8\t10\t16\t18\t21\t24\t28\t28\t29\t30\t35\t38\t38\t43\t46\t49";
//        String[] arrStr = str.split("\t");
////        for (int i = 0; i < length; i++) {
////            array[i] = Integer.parseInt(arrStr[i]);
////        }
////        Arrays.stream(array).forEach(n -> System.out.printf("%4d", n));
//        BinarySearchDemo search = new BinarySearchDemo();
//        System.out.println();
//        int n = random.nextInt(100000000);
//​
//        long startTime = System.currentTimeMillis();
//        System.out.println("Vi tri cua 30: " + search.search(array, n));
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time in milisecond: " + (endTime - startTime));
//​
//        startTime = System.currentTimeMillis();
//        System.out.println("Vi tri cua 30: " + search.search2(array, 0, length - 1, n));
//        endTime = System.currentTimeMillis();
//        System.out.println("Time in milisecond: " + (endTime - startTime));
//​
//        startTime = System.currentTimeMillis();
//        System.out.println("Vi tri cua 30: " + search.searchLinear(array, n));
//        endTime = System.currentTimeMillis();
//        System.out.println("Time in milisecond: " + (endTime - startTime));
//    }
//​
//    public int search(int[] arr, int n) {
//        int low = 0, high = arr.length - 1, mid = (low + high)/2;
//        while (low <= high) {
//            if (arr[mid] == n) {
//                return mid;
//            } else if (arr[mid] > n) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//            mid = (low + high)/2;
//        }
//​
//        return -1;
//    }
//​
//    public int search2(int[] arr, int low, int high, int n) {
//        if (low > high) {
//            return -1;
//        }
//        int mid = (low + high)/2;
//        if (arr[mid] == n) {
//            return mid;
//        }
//        if (arr[mid] > n) {
//            return search2(arr, low, mid - 1, n);
//        }
//        return search2(arr, mid + 1, high, n);
//    }
//​
//    public int searchLinear(int[] arr, int n) {
//        int length = arr.length;
//        for (int i = 0; i < length; i++) {
//            if (arr[i] == n) {
//                return i;
//            }
//        }
//        return -1;
    }
}