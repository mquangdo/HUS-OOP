package hus.oop.lab07.quest6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Wooow");
    }
    public void greets(Dog anothe){
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
