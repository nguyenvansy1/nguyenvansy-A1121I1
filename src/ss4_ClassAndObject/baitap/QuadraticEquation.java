package ss4_ClassAndObject.baitap;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void getDiscriminant() {
        double delta = (b * b) - (4 * a * c);
        if (delta<0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else
            if (delta==0)
            {
                double x = (-b/2*a);
                System.out.println("Phuong trinh co nghiem kep x1=x2=" + x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet la x1=" +x1 + " x2=" + x2 );
            }
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        stopWatch.start();
        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());

        quadraticEquation.setA(1);
        quadraticEquation.setB(-3);
        quadraticEquation.setC(2);
        quadraticEquation.getDiscriminant();

        stopWatch.stop();
        System.out.println("Thoi gian ket thuc: " + stopWatch.getEndTime());
        System.out.println("Thoi gian chenh lech: " + stopWatch.getElapsedTime());

    }

}

