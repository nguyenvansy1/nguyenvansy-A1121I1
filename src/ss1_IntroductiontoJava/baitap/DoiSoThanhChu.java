package ss1_IntroductiontoJava.baitap;
import java.util.Scanner;

public class DoiSoThanhChu {

    public static String oneToNine(int number) {
        String result = "";
        switch (number) {
            case 0:
                result = "";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
        }
        return result;
    }

    public static String tenToNineTeen(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "Ten";
                break;
            case 11:
                result = "Eleven";
                break;
            case 12:
                result = "Twelve";
                break;
            case 13:
                result = "Thirteen";
                break;
            case 14:
                result = "Fourteen";
                break;
            case 15:
                result = "Fifteen";
                break;
            case 16:
                result = "Sixteen";
                break;
            case 17:
                result = "Seventeen";
                break;
            case 18:
                result = "Eighteen";
                break;
            case 19:
                result = "Nineteen";
                break;
            default:
        }
        return result;
    }

    public static String twentyToOneHundred(int number) {
        String result = "";
        switch (number) {
            case 0:
                result = "";
                break;
            case 1:
                result = "";
                break;
            case 2:
                result = "Twenty";
                break;
            case 3:
                result = "Thirty";
                break;
            case 4:
                result = "Forty";
                break;
            case 5:
                result = "Fifty";
                break;
            case 6:
                result = "Sixty";
                break;
            case 7:
                result = "Seventy";
                break;
            case 8:
                result = "Eighty";
                break;
            case 9:
                result = "Ninety";
                break;
            default:
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập number :");
        int number = scanner.nextInt();

        String result = "";

        DoiSoThanhChu number1 = new DoiSoThanhChu();//tao doi tuong

        if (number == 0) {
            result = "Zero";
        } else if (number < 10) {
            result = number1.oneToNine(number);
        } else if (number < 20) {
            result = number1.tenToNineTeen(number);
        } else if (number < 100) {
            result = number1.twentyToOneHundred(number / 10) + "-" + number1.oneToNine(number % 10);
        } else if (number < 1000 && number % 100 != 0) {
            result = number1.oneToNine(number / 100) + " hundred and " +number1.twentyToOneHundred(number % 100 / 10);
            if (number % 100 / 10 == 1) {
                result += " " +number1.tenToNineTeen(number % 100);
            }//101-119
            else {
                result += " " + number1.oneToNine(number % 10);
            }

        } else {
            result = number1.oneToNine(number / 100) + " hundred ";
        }
        System.out.println("Read number: " + result);
    }
}





