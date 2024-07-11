package hus.oop.lab10.question2.ex1;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (instance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            instance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return instance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with milk/chocolate mixture");
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            System.out.println("Draining the boiled milk and chocolate");
        }
        empty = true;
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            System.out.println("Bring the contents to a boil");
        }
        boiled = true;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
