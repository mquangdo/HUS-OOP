package Lab4;

import java.util.Arrays;

public class ExercisesOnComposition {
    public static void main(String[] args) {
        Author.testAuthor();
        Book.testBook();
        Invoice.testInvoice();
        MyPoint.testPoint();
        MyCircle.testMyCircle();
        MyLine.testMyLine();
        MyTriangle.testTriangle();
    }
}

class Author {
    private final char gender;
    private String name;
    private String email;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public static void testAuthor() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }

}

class Book {

    private final String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public static void testBook() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Author paulTan = new Author("Paul Tan", "paul@nowhere", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author name is: " + dummyBook.getAuthor().getName());
        System.out.println("Auther's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@nowhere", 'm'), 29.95);
        System.out.println(anotherBook);


    }


    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getAuthorName() {
        return this.author.getName();
    }
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}

class Customer {
    private final int id;
    private final String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
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

class Invoice {
    private final int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public static void testInvoice() {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer1);

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("discount: " + customer1.getDiscount());

        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getId());
        System.out.println("customer is: " + invoice1.getCustomer());
        System.out.println("customer's name is: " + invoice1.getCustomer().getName());
        System.out.println("customer's discount is: " + invoice1.getCustomer().getDiscount());
        System.out.println("amount after discount is: " + invoice1.getAmountAfterDiscount());
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getID();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount * (100 - this.customer.getDiscount()) / 100;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                ']';
    }


}

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        testPoint();
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println(points[i]);
        }
    }

    public static void testPoint() {
        MyPoint point1 = new MyPoint();
        System.out.println(point1);

        point1.setX(8);
        point1.setY(6);

        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());
        point1.setXY(3, 0);
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint point2 = new MyPoint(0, 4);
        System.out.println(point2);

        System.out.println(point1.distance(point2));
        System.out.println((point2.distance(point1)));
        System.out.println(point1.distance(5, 6));
        System.out.println(point1.distance());

    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        double squared = x * x + y * y;
        return Math.sqrt(squared);
    }

    public double distance(MyPoint another) {
        double dx = this.x - another.getX();
        double dy = this.y - another.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance() {
        double dx = this.x;
        double dy = this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class MyLine {

    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        MyPoint p1 = new MyPoint(2, 2);

        MyLine ml = new MyLine(p, p1);
        System.out.println(ml);

    }

    public static void testMyLine() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyLine ml = new MyLine(p1, p2);
        System.out.println(ml);
        System.out.println("Begin point is: " + ml.getBegin());
        System.out.println("End point is: " + ml.getEnd());

    }

    public MyPoint getBegin() {
        return this.begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return this.end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{this.begin.getX(), this.begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{this.end.getX(), this.end.getY()};
    }

    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        double xDiff = this.end.getX() - this.begin.getX();
        double yDiff = this.end.getY() - this.begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }
}

class MyCircle {

    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }

    public static void testMyCircle() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle c1 = new MyCircle(center, 1);
        MyCircle c2 = new MyCircle(2, 2, 4);
        System.out.println(c1);
        System.out.println(c2);
        c1.setCenter(new MyPoint(3, 2));
        System.out.println(c1);
        System.out.println("The distance between 2 points is: " + c1.distance(c2));
        System.out.println("The area is: " + c1.getArea());
        System.out.println("The circumference is : " + c1.getCircumference());
        c1.setCenterXY(4, 5);
        System.out.println(c1);
        c1.setRadius(5);
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The xcenter is: " + c1.getCenterX());
        System.out.println("The ycenter is: " + c1.getCenterY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{this.center.getX(), this.center.getY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center +
                ", radius=" + radius +
                ']';
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}

class MyTriangle {
    private final MyPoint v1;
    private final MyPoint v2;
    private final MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public static void testTriangle() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(0, 1);
        MyPoint p3 = new MyPoint(1, 0);
        MyTriangle tri = new MyTriangle(p1, p2, p3);
        System.out.println(tri);
        System.out.println(tri.getType());
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
    }

    public String getType() {
        double disV1V2 = this.v1.distance(v2);
        double disV2V3 = this.v2.distance(v3);
        double disV3V1 = this.v3.distance(v1);
        if (disV1V2 == disV2V3 && disV2V3 == disV3V1) {
            return "Equilateral";
        } else {
            if (disV1V2 == disV2V3 || disV2V3 == disV3V1 || disV1V2 == disV3V1) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
    }
}



