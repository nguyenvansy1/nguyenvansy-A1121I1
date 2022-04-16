package ss6_KeThua.baitap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Circle circle = new Circle();
        circle = new Circle(2,"blue",2);
        System.out.println(circle.toString());

        cylinder = new Cylinder(2);
        System.out.println(cylinder);

        cylinder = new Cylinder(2,2,"red",4);
        System.out.println(cylinder);
        System.out.println(cylinder.toString());
    }
}
