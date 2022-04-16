package ss3_MangVaPhuongThuc.baitap;
import  java.util.Scanner;
public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số hàng của mảng");
        int a = input.nextInt();
        System.out.println("Nhập số cột của mảng");
        int b = input.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Nhập phần tử ["+row+","+column+"]" );
                matrix[row][column] = input.nextInt();
            }
        }
        int max = 0;
       for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
              if (matrix[row][column]>max)
              {
                  max = matrix[row][column];
              }
            }
       }
        System.out.println("Giá trị lớn nhất trong mảng là :" + max);

        /*
        int sum = 0;
        for (int row = 0 ; row < matrix.length;row++)
        {
            for (int column = 0 ;column < matrix[row].length;column++)
               sum += matrix[row][column];
       }
        System.out.println(sum);

        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is "
                    + total);
        } */

    }
}
