package hus.oop.lab11.decorator.example.example2;

public abstract class Pizza {
    protected String description = "Basic Pizza";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
