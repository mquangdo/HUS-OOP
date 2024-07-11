
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Quang");
        StringBuilder s2 = s;
        s2.append("Ngu");
        System.out.println(s);
    }

    public static void changeString(String s){
        s += "Ngu";
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

class Parent{

    public static void main(String[] args) {
        Parent parent = new Parent("Quang");
        Parent parent1 = parent;
        parent1.setName("QuangNgu");
        System.out.println(parent.name);
    }
    String name;
    public Parent(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }
}
