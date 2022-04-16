package ss6_KeThua.baitap;

public class Point3D  extends Point2D{
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float z , float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x ,float y ,float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }

    public String toString() {
        return  super.toString() +" z =" + getZ() ;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(1, 2, 3);
        System.out.println(point3D);
        System.out.println(point3D.toString());
    }
}
