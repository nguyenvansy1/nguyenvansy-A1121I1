package ss6_KeThua.thuchanh;

import ss7_AbstractClassAndInterface.baitap.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {

        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }


    public void setSide(double side) {
        setWidth(side);
    }
    public double getArea(){
        return (getSide()*4);
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println( "Color all four sides");
    }
}