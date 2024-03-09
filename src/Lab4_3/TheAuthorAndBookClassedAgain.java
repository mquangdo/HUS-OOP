package Lab4_3;

import Homework2.ArrayHomework;

import java.util.Arrays;

public class TheAuthorAndBookClassedAgain {
    public static void main(String[] args) {
        Author.testAuthor();
        Book.testBook();
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
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }


    public Book(String name,Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public static void testBook() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com",'m');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com",'m');

        Book javaDummy = new Book("Java for dummies", authors,19.99, 99);
        System.out.println(javaDummy);

    }


    public String getName() {
        return this.name;
    }

    public Author[] getAuthor() {
        return this.authors;
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

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames(){
        String result = "";
        for (int i = 0; i < this.authors.length; i++){
            result += authors[i].getName();
        }
        return result;
    }
}
