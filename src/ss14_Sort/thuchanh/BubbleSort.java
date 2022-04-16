package ss14_Sort.thuchanh;

public class BubbleSort {
   public static void bubbleSort(int arr[]) {
       boolean needNextPass = true;
        int n = arr.length;
        for (int i = 0; i < n - 1 && needNextPass; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    needNextPass =true;
                }
    }

    public static void main(String[] args) {
     int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
     bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
