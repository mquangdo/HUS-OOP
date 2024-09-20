package OOP2023_2024.bookmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if (index < 0 || index > limit){
            return false;
        }
        return true;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        for (Book book1: bookList){
            if (book1 == book){
                bookList.remove(book1);
            }
        }
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        /* TODO */
        List<Book> temp = bookList;
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (book1.compareTo(book2) > 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        /* TODO */
        List<Book> temp = bookList;
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (book1.compareTo(book2) < 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        List<Book> temp = new LinkedList<>(bookList);
        PriceCompare priceCompare = new PriceCompare();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (priceCompare.compare(book1, book2) > 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        List<Book> temp = new LinkedList<>(bookList);
        PriceCompare priceCompare = new PriceCompare();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (priceCompare.compare(book1, book2) < 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> temp = bookList;
        PageCompare pageCompare = new PageCompare();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (pageCompare.compare(book1, book2) > 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        List<Book> temp = new LinkedList<>(bookList);
        PageCompare pageCompare = new PageCompare();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j ++){
                Book book1 = bookList.get(j);
                Book book2 = bookList.get(j + 1);
                if (pageCompare.compare(book1, book2) < 0){
                    Book cur = bookList.get(j);
                    bookList.set(j, bookList.get(j + 1));
                    bookList.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> sorted = sortDecreasingPages();
        int size = Math.max(howMany, sorted.size());
        List<Book> temp = new LinkedList<>();
        for (int i = 0; i < size; i++){
            temp.add(sorted.get(i));
        }
        return temp;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> temp = new LinkedList<>();
        for (Book book: bookList){
            if (book.getPages() > lowerBound){
                temp.add(book);
            }
        }
        return temp;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> sorted = sortIncreasingPages();
        int size = Math.max(howMany, sorted.size());
        List<Book> temp = new LinkedList<>();
        for (int i = 0; i < size; i++){
            temp.add(sorted.get(i));
        }
        return temp;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> temp = new LinkedList<>();
        for (Book book: bookList){
            if (book.getPages() < upperBound){
                temp.add(book);
            }
        }
        return temp;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> temp = new LinkedList<>();
        for (Book book: bookList){
            if (book.getAuthor().equals(publisher)){
                temp.add(book);
            }
        }
        return temp;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> temp = new LinkedList<>();
        for (Book book: bookList){
            if (book.getAuthor().equals(genre)){
                temp.add(book);
            }
        }
        return temp;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> temp = new LinkedList<>();
        for (Book book: bookList){
            if (book.getAuthor().equals(author)){
                temp.add(book);
            }
        }
        return temp;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
