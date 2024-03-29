package hus.oop.lab6.quest5;

public class Animal {
    private String name;
    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal[name=" + this.name + "]";
    }
}
