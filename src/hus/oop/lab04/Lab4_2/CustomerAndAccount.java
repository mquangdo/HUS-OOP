package hus.oop.lab04.Lab4_2;

public class CustomerAndAccount {
    public static void main(String[] args) {
        Account.testAccount();
    }
}
class Customer {
    private int id;
    private String name;
    private int discount;

    private char gender;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public Customer(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ']';
    }
}

class Account {

    private int id;
    private String name;
    private double balance;

    private Customer customer;

    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            return this;
        }
        else {
            System.out.println("amount withdraw exceeds the current balance!");
            return this;
        }
    }

    public void transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.credit(amount);
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }

    public static void testAccount(){
        Customer customer1 = new Customer(13,"Quang", 'm');
        Account account1 = new Account(12,customer1);
        System.out.println(customer1);
        System.out.println(account1);
        System.out.println("Discount is: " + customer1.getDiscount());
        System.out.println("Balance is:" + account1.getBalance());
        account1.withdraw(100);
        account1.setBalance(110);
        account1.withdraw(100);
        System.out.println(account1.getBalance());
    }
}

