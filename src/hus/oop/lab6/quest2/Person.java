package hus.oop.lab6.quest2;

public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }

    public Person(){

    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
