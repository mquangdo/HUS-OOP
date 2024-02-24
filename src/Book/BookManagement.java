package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */
    public static Book[] readData(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(sc.nextLine());

            if (t == 1) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                int quantity = Integer.parseInt(sc.nextLine());
                String publisher = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                boolean status = Boolean.parseBoolean(sc.nextLine());
                books[i] = new TextBook(id, name, quantity, publisher, price, status);

            } else if (t == 0) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                int quantity = Integer.parseInt(sc.nextLine());
                String publisher = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                double tax = Double.parseDouble(sc.nextLine());
                books[i] = new ReferenceBook(id, name, quantity, publisher, price, tax);


            }
        }


        return books;
    }

    // In thong tin các cuốn sách
    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());


        }

    }

    public static void main(String[] args) {

    }

    // Tìm các cuốn sách của nhà xuất bản publisher
    public ArrayList<Book> findBooks(Book[] books, String publisher) {
        ArrayList<Book> findbooks = new ArrayList<>();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                findbooks.add(books[i]);
            }

        }


        return findbooks;


    }

    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
    public double computeAverage(Book[] books, String typeOfBooks) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getClass().getName().equals(typeOfBooks)) {
                count++;
                sum = sum + books[i].getAmount();
            }

        }

        return sum / count;
    }

    // Sắp xếp các cuốn sách tăng dần về giá tiền
    public void sortByPrice(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j + 1].getPrice() < books[j].getPrice()) {
                    Book temp = books[j + 1];
                    books[j + 1] = books[j];
                    books[j] = temp;
                }
            }
        }


    }
}
