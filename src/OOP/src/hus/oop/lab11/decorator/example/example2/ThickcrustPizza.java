package hus.oop.lab11.decorator.example.example2;

public class ThickcrustPizza extends Pizza{
    public ThickcrustPizza(){
        description = "Thick crust pizza, with tomato sauce";
    }

    public double cost(){
        return 7.99;
    }
}
