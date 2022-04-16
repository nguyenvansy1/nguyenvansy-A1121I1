package ss7_AbstractClassAndInterface.baitap;

import ss6_KeThua.thuchanh.Circle;

public class CircleTest extends Circle implements Resizeable {


    public double resize(double percent) {
        double area = (getRadius() * getRadius() * Math.PI) * percent;
        return area;
    }


}
