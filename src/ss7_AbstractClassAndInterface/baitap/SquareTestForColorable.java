package ss7_AbstractClassAndInterface.baitap;

import ss6_KeThua.thuchanh.Square;

public class SquareTestForColorable {

        public static void main(String[] args) {
            Square squares = new Square();
            System.out.println(squares);

            squares = new Square(4.5);
            System.out.println(squares);

            squares = new Square(5.5,"orange", true);
            System.out.println(squares);
        }
    }

