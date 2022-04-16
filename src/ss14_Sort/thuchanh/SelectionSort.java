package ss14_Sort.thuchanh;

public class SelectionSort {
    public static void selectionSort(int[] array)
    {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
