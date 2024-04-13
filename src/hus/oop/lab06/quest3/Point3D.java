package hus.oop.lab06.quest3;

public class Point3D extends Point2D{

    public static void main(String[] args) {
        Point3D p = new Point3D(1,1,1);
        System.out.println(p.getX());
    }

    @Override
    public float getX() {
        return super.getX();
    }

    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "(" + getX() + ',' + getY() + ',' + this.z + ")";
    }
}
