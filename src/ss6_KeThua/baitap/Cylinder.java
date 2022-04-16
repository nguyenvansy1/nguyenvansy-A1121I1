package ss6_KeThua.baitap;

public class Cylinder  extends Circle{
    private int height;

    public Cylinder(){

    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int height ,int radius,String color ,int area){
        super(radius,color,area);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double Volume() {
        return Math.PI*getRadius()*getRadius()*getHeight();
    }

    @Override
    public String toString(){
        return "Radius = " + getRadius() + " Color = " + getColor() + " Area = " + super.toString() + " Height =" +getHeight() + " Volume =" + Volume();
    }
}
