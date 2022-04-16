package ss7_AbstractClassAndInterface.baitap;
import ss6_KeThua.thuchanh.Square;
public class SquareTest extends Square implements Resizeable { ;
    @Override
    public double resize(double percent) {
      double area = (getSide()*4)*percent ;
      return area ;
    }
}
