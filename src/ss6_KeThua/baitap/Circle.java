package ss6_KeThua.baitap;

public class Circle {
    private int radius ;
    private String color ;
    private int area ;

    public Circle()
    {

    }

    public Circle(int radius, String color, int area){
        this.radius = radius;
        this.color = color;
        this.area = area;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return  Math.PI*this.radius*this.radius;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String toString(){
        return "Radius = " + getRadius() + " Color = " + getColor() + " Area = " + getArea() + "";
    }
}
