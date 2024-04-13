package hus.oop.lab04.Lab4_4;

public class TheAuthorAndBookClassesYourTurn {
    public static void main(String[] args) {
        Author.testAuthor();
    }
}
class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void testAuthor() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
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


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Book{
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

   public Book(String isbn, String name, Author author, double price){
       this.isbn = isbn;
       this.name = name;
       this.author = author;
       this.price = price;
   }
   public Book(String isbn, String name, Author author, double price, int qty){
       this.isbn = isbn;
       this.name = name;
       this.author = author;
       this.price = price;
       this.qty = qty;
   }
   public String getISBN(){
       return this.isbn;
   }
   public String getName(){
       return this.name;
   }
   public Author getAuthor(){
       return this.author;
   }
   public double getPrice(){
       return this.price;
   }
   public void setPrice(double price){
       this.price = price;
   }
   public int getQty(){
       return this.qty;
   }
   public void setQty(int qty){
       this.qty = qty;
   }

   public String getAuthorName(){
       return this.author.getName();
   }

    @Override
    public String toString() {
        return "Book[" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public static void testBook(){
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);

        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is:" + book1.getISBN());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("author is: " + book1.getAuthor());
        System.out.println("author's name: " + book1.getAuthorName());
        System.out.println("author's name: " + book1.getAuthor().getName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());
    }
}

