package ss7_AbstractClassAndInterface.thuchanh.Comparator;

import ss6_KeThua.thuchanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
       int a = c1.getRadius() > c2.getRadius() ? 1:-1;
       return a;
    }
}
