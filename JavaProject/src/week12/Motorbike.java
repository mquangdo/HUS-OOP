package week12;

public class Motorbike
{
    private String id;
    private String name;
    private String manu;
    private int quantity;
    private double price;
    private double weight;
    private String date;

    public Motorbike(){
    }

    public Motorbike(String id,String name,String manu,int quantity,double price,double weight,String date){
        this.id = id;
        this.name = name;
        this.manu = manu;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.date = date;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getManu(){
        return this.manu;
    }
    public void setManu(String manu){
        this.manu = manu;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setId(double weight){
        this.weight = weight;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void printMotorbike(){
        System.out.println( this.id +" "+ this.name +" "+ this.manu +" " +this.quantity +" "+this.price+" "+this.weight + " " +this.date);
    }
}