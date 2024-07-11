package hus.oop.lab06.quest3;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,1,1);
        System.out.println(point3D);
        System.out.println("The z pos is: " + point3D.getZ());
        point3D.setXYZ(2,2,2);
        System.out.println("New 3D point is: " + point3D);
    }
}
