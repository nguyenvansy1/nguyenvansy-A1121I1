package ss6_KeThua.baitap;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float y) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    public String toString() {
        return super.toString() + " xSpeed = " + getXSpeed() + " ySpeed = " + getYSpeed();
    }

    public MoveablePoint Move(){
        this.setX(this.getX() + getXSpeed()) ;
        this.setY(this.getY() + getYSpeed()) ;
     return this;
    }

    public static void main(String[] args) {
        Point moveablePoint = new MoveablePoint();

        MoveablePoint moveablePoint1 = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint1.toString());
        System.out.println(moveablePoint1.Move());
    }
}
