package ss4_ClassAndObject.baitap;



public class Fan {
    final  int SLOW = 1;
    final  int MEDIUM = 2;
    final  int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius =5 ;
    private String color = "blue" ;

    public Fan(){

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toStringInfo()
    {
        if (this.on = true)
        {
            System.out.println("Fan is on");
            System.out.println("Tốc độ của Fan = " + speed + " Màu của Fan là " + color + " Bán kính của Fan = " + radius );
        }
        else
         
        {
            System.out.println("Fan is off");
            System.out.println("Màu của quạt là " + color + " Bán kính của quạt là " + radius);
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setOn(true);
        fan.setColor("yellow");
        fan.toStringInfo();

        fan.setSpeed(2);
        fan.setRadius(5);
        fan.setOn(false);
        fan.setColor("blue");
        fan.toStringInfo();


    }
}
