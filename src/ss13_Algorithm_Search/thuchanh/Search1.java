package ss13_Algorithm_Search.thuchanh;

public class Search1 {
    public int search(int[] arr, int n) {
        int low = 0, height = arr.length-1, mid = (low+height)/2;
        while(low<=height)
        {
            if (arr[mid]==n)
            {
                return mid;
            }
            else
                if (arr[mid]<n)
                {
                    low=mid+1;
                    mid=(low+height)/2;
                }
                else
                    height=mid-1;
                    mid=(low+height)/2;
        }
        return -1;
    }
    public int search2(int[] arr, int low, int high, int n) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high)/2;
        if (arr[mid] == n) {
            return mid;
        }
        if (arr[mid] > n) {
            return search2(arr, low, mid - 1, n);
        }
        return search2(arr, mid + 1, high, n);
    }
    public static void main(String[] args) {
        Search1 search = new Search1();
        int[] array = {0, 0, 7, 7, 8, 10, 16, 18, 21, 24, 28, 28, 29, 30, 35, 38, 38, 43, 46, 49};
        System.out.println("Vi tri cua 30: " + search.search(array, 30));
        System.out.println("Vi tri cua 30: " + search.search2(array, 0,array.length - 1,30));
    }



}

