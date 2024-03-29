package hus.oop.lab6.quest7;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setHeight(10);
        cylinder.setRadius(5);
        System.out.println(cylinder.getAroundArea());
        System.out.println(cylinder.getBaseArea());
        System.out.println(cylinder.getTotalArea());
    }
}
