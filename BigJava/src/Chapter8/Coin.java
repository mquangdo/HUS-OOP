package Chapter8;

public class Coin {
    private double value;
    private String name;

    public Coin(double aValue, String aName) {
        value = aValue;
        name = aName;
    }
    public double getValue(){
        return this.value;
    }
    public String getName(){
        return this.name;
    }
}
