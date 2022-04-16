package ss7_AbstractClassAndInterface.baitap;


import ss6_KeThua.thuchanh.Circle;
import ss6_KeThua.thuchanh.Rectangle;

public class ResizeableTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setRadius(10);
        CircleTest circle = new CircleTest();
        circle.setRadius(circle1.getRadius());

       /* Square square1= new Square();
        square1.setSide(10);
        SquareTest square = new SquareTest();
        square.setSide(square1.getSide()); */

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setLength(10);
        RectangleTest rectangle = new RectangleTest();
        rectangle.setWidth(rectangle1.getWidth());
        rectangle.setLength(rectangle1.getLength());

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new CircleTest();
        resizeables[1] = new SquareTest();
        resizeables[2] = new RectangleTest();



        System.out.println("Kích thước hình tròn trước khi tăng : " +(int) circle1.getArea() );
        System.out.println("Kích thước hình tròn sau khi tăng : " +(int)   circle.resize((Math.random()*100)) );

        System.out.println("Kích thước hình chữ nhật trước khi tăng : " +(int)  rectangle1.getArea() );
        System.out.println("Kích thước hình chữ nhật sau khi tăng : " +(int)  rectangle.resize((Math.random()*100)) );

      /*  System.out.println("Kích thước hình vuông trước khi tăng : " +(int)  square1.getArea() );
        System.out.println("Kích thước hình vuông sau khi tăng : " +(int)  resizeables[2].resize(Math.random()*100 ) );
*/



    }

}
