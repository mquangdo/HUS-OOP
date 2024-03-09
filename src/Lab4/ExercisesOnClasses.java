package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercisesOnClasses{
    public static void main(String[] args) {
        Circle.testCircle();
        Rectangle.testRectangle();
        Employee.testEmployee();
        InvoiceItem.testInvoiceItem();
        Account.testAccount();
        MyPolynomial.testMyPolynomial();
        MyComplex.testMyComplex();
    }
}

class Circle {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void testCircle(){
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);

        //Test getter and setter
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        //Test getArea() and getCircumference()
        System.out.println("area is: " + circle1.getArea());
        System.out.println("circumference is: " + circle1.getCircumference());
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + this.radius + "]";
    }

}

class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {

    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public static void testRectangle() {
        Rectangle rec1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rec1);
        Rectangle rec2 = new Rectangle();
        System.out.println(rec2);

        //Test getter setter
        rec1.setLength(5.6f);
        rec1.setWidth(7.8f);
        System.out.println(rec1);
        System.out.println("length is: " + rec1.getLength());
        System.out.println("width is: " + rec1.getWidth());

        //Test getArea() and getPerimeter()
        System.out.println("area is: " + rec1.getArea());
        System.out.println("perimeter is: " + rec1.getPerimeter());
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    @Override
    public String toString() {
        return "Rectangle[length = " + this.length + ", width = " + this.width + "]";
    }
}

class Employee {

    public static void testEmployee(){
        Employee employee1 = new Employee(8, "Peter", "Tam", 2500);
        System.out.println(employee1);
        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("id is: " + employee1.getID());
        System.out.println("first name is: " + employee1.getFirstName());
        System.out.println("last name is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary * (percent + 10) / 100;
    }

    @Override
    public String toString() {
        return "Employee[id = " + getID() + ", name = " + this.firstName + " " + this.lastName + ", salary = " + this.salary;
    }
}

class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem() {

    }

    public static void testInvoiceItem(){
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.09);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getID());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        System.out.println("The total is: " + inv1.getTotal());
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }
}

class Account {
    private final String id;
    private final String name;
    private int balance;

    public static void testAccount(){
        Account account1 = new Account("A101", "Tan Ah Teek", 88);
        System.out.println(account1);
        Account account2 = new Account("A102", "Kumar");
        System.out.println(account2);

        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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
}

class MyComplex {

    static Scanner in = new Scanner(System.in);
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void testMyComplex() {
        System.out.print("Enter complex number1 (real and imaginary): ");
        MyComplex complex1 = generateComplex(in);
        System.out.print("Enter complex number2 (real and imaginary): ");
        MyComplex complex2 = generateComplex(in);

        System.out.print("Number 1 is: " + complex1);
        testRealAndImaginaryPart(complex1);

        System.out.print("Number 2 is: " + complex2);
        testRealAndImaginaryPart(complex2);

        testAdd(complex1, complex2);

    }

    public static MyComplex generateComplex(Scanner in) {
        double real;
        double image;

        real = in.nextDouble();
        image = in.nextDouble();

        return new MyComplex(real, image);
    }

    public static void testRealAndImaginaryPart(MyComplex complex) {
        if (complex.isReal()) {
            System.out.println(complex + " is pure real number");
        } else if (complex.isImaginary()) {
            System.out.println(complex + " is pure imaginary number");
        } else {
            System.out.println(complex + " is NOT a pure real number");
            System.out.println(complex + " is NOT a pure imaginary number");
        }
    }

    public static void testEquals(MyComplex complex1, MyComplex complex2) {
        if (!complex1.equals(complex1)) {
            System.out.println(complex1 + " is NOT equals " + complex2);
        } else {
            System.out.println(complex1 + " is equals " + complex2);
        }
    }

    public static void testAdd(MyComplex complex1, MyComplex complex2) {
        MyComplex complex3 = complex1.addNew(complex2);
        System.out.print(complex1 + " + " + complex2 + " = " + complex3);
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + this.imag + "i)";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return another.getReal() == this.real && another.getImag() == this.imag;
    }

    public double magnitude() {
        double moduleSquared = this.real * this.real + this.imag * this.imag;
        return Math.sqrt(moduleSquared);
    }

    public MyComplex addNew(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return new MyComplex(this.real, this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }
}

class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeff) {
        double[] coeffs = new double[coeff.length];
        System.arraycopy(coeff, 0, coeffs, 0, coeff.length);
        this.coeffs = coeffs;
    }

    public static void main(String[] args) {
        MyPolynomial poly = new MyPolynomial(1.1, 1.5, 2.5, 3.6);
        System.out.println(Arrays.toString(poly.coeffs));
        System.out.println(poly);
        System.out.println(poly.evaluate(1));
        int[] a1 = {1, 4, 1};
        int[] a2 = {1, 3, 1};
        MyPolynomial poly1 = new MyPolynomial(1, 3, 1);
        MyPolynomial poly2 = new MyPolynomial(1, 4, 1);
        MyPolynomial res = poly1.multiply(poly2);
        System.out.println(res);
    }

    public static int[] multiply(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length - 1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                res[i + j] += a1[i] * a2[j];
            }
        }
        return res;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return this.coeffs;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.coeffs.length; i++) {
            res = " " + this.coeffs[i] + "x^" + i + " +" + res;
        }
        return res.substring(0, res.length() - 1).trim();
    }

    public double evaluate(double x) {
        double res = 0;
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            res = x * res + this.coeffs[i];
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxLength = Math.max(this.coeffs.length, right.getCoeffs().length);
        int minLength = Math.min(this.coeffs.length, right.getCoeffs().length);
        double[] newCoeffs = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            newCoeffs[i] = this.coeffs[i] + right.getCoeffs()[i];
        }
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] coef1 = this.coeffs;
        double[] coef2 = right.getCoeffs();
        double[] result = new double[this.coeffs.length + right.getCoeffs().length - 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.getCoeffs().length; j++) {
                result[result.length - 1 - (i + j)] += coef1[i] * coef2[j];
            }
        }
        this.coeffs = result;
        return this;
    }

    public static void testMyPolynomial(){
        MyPolynomial poly1 = new MyPolynomial(1,1,1);
        MyPolynomial poly2 = new MyPolynomial(1,3,5);
        System.out.println(poly1);
        System.out.println(poly2);
        System.out.println("The value of poly1 at 0.5 is: " + poly1.evaluate(0.5));
        System.out.println("The sum of poly1 and poly2 is: " + poly1.add(poly2));
        System.out.println("The multiply of poly1 and poly2 is: " + poly1.multiply(poly2));
    }
}



