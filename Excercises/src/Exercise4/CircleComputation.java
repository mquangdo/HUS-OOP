package Exercise4;
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        findAreaAndCircumference(radius);
    }

    public static void findAreaAndCircumference(double radius) {
        double diameter = 2.0 * radius;
        System.out.printf("Diameter is : %.2f%n", diameter);
        System.out.println();
        double area = Math.PI * radius * radius;
        double circumference = 2.0 * Math.PI * radius;
        System.out.printf("Area is : %.2f%n", area);
        System.out.println();
        System.out.printf("Circumference is : %.2f%n", circumference);
    }
}
