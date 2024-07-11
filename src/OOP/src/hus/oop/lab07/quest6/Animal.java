package hus.oop.lab07.quest6;

abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public Animal(){

    }
    abstract void greets();
}
