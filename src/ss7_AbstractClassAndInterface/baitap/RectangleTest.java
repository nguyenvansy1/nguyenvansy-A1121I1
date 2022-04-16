package ss7_AbstractClassAndInterface.baitap;

import ss6_KeThua.thuchanh.Rectangle;

public class RectangleTest extends Rectangle implements Resizeable {

    @Override
    public double resize(double percent) {
        double area = ((getWidth()+getLength())*2)*percent;
        return area;
    }
}
