package hus.oop.lab06.casting;

public class Parent {
    public static void main(String[] args) {
        Parent parent = new Parent(35,"Quang");
        Parent child = new Child(13,"Quan","HUS");
        System.out.println(parent instanceof Child);
        child.play();

    }
    protected int age;
    protected String name;
    public Parent(){
    }
    public Parent(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void play(){

    }
}

class Child extends Parent{
    protected String school;
    public Child(){

    }
    public Child(int age, String name, String school){
        super(age, name);
        this.school = school;
    }
    public void play(){
        System.out.println("Playing");
    }
}
