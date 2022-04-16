package ss5_Accessmodifierstaticmethodstaticproperty.baitap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(3);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
