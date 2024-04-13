import Car.Car;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}

class Circle{
    private final String kumden = "ngu";
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}
