package hus.oop.lab11.decorator.example.example2;

public class ThincrustPizza extends Pizza{
    public ThincrustPizza(){
        description = "Thin crust pizza, with tomato sauce";
    }
    public double cost(){
        return 7.99;
    }
}
