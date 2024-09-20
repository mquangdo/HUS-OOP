package oop.hus.oop.bookmanager;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        /* TODO */
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
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
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPos(Book book, int index) {
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
            if (book1.equals(book)){
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
     * Sắp xếp danh sách book theo thứ tự tăng dần theo title.
     * @return
     */
    public List<Book> sortIncreasingByTitle() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1- i; j++){
                if (bookAt(j).compareTo(bookAt(j + 1)) > 0){
                    Book book1 = bookAt(j);
                    bookList.set(j, bookAt(j + 1));
                    bookList.set(j + 1, book1);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        SortTitleAndPrice sortTitleAndPrice = new SortTitleAndPrice();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (sortTitleAndPrice.compare(bookAt(j), bookAt(j + 1)) > 0){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        SortTitileAndPriceAgain sortTitileAndPriceAgain = new SortTitileAndPriceAgain();
        for (int i = 0; i < temp.size() - 1; i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (sortTitileAndPriceAgain.compare(bookAt(j), bookAt(j + 1)) > 0){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;

    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        for (int i = 0; i < temp.size(); i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (temp.get(j).getPrice() > temp.get(j + 1 ).getPrice()){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        for (int i = 0; i < temp.size(); i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (temp.get(j).getPrice() < temp.get(j + 1 ).getPrice()){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        for (int i = 0; i < temp.size(); i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (temp.get(j).getPages() > temp.get(j + 1).getPages()){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;

    }

    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        List<Book> temp = new ArrayList<>(bookList);
        for (int i = 0; i < temp.size(); i++){
            for (int j = 0; j < temp.size() - 1 - i; j++){
                if (temp.get(j).getPages() < temp.get(j + 1).getPages()){
                    Book cur = temp.get(j);
                    temp.set(j, bookAt(j + 1));
                    temp.set(j + 1, cur);
                }
            }
        }
        return temp;
    }

    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        /* TODO */
        List<Book> sorted = sortDecreasingPrice();
        List<Book> fil = new ArrayList<>();
        int min = Math.min(howMany, sorted.size());
        for (int i = 0; i < min; i++){
            fil.add(sorted.get(i));
        }
        return fil;
    }

    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        /* TODO */
        List<Book> fil = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPrice() > lowerBound){
                fil.add(bookList.get(i));
            }
        }
        return fil;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> sorted = sortIncreasingPages();
        List<Book> fil = new ArrayList<>();
        int min = Math.min(howMany, sorted.size());
        for (int i = 0; i < min; i++){
            fil.add(sorted.get(i));
        }
        return fil;
    }

    public List<Book> filterBookHighestPrice(int howMany){
        List<Book> sorted = sortDecreasingPrice();
        List<Book> fil = new ArrayList<>();
        int min = Math.min(howMany, sorted.size());
        for (int i = 0; i < min; i++){
            fil.add(sorted.get(i));
        }
        return fil;
    }

    public List<Book> filterBookLowestPrice(int howMany){
        List<Book> sorted = sortIncreasingPrice();
        List<Book> fil = new ArrayList<>();
        int min = Math.min(howMany, sorted.size());
        for (int i = 0; i < min; i++){
            fil.add(sorted.get(i));
        }
        return fil;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> fil = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPages() < upperBound){
                fil.add(bookList.get(i));
            }
        }
        return fil;

    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> fil = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPublisher().equals(publisher)){
                fil.add(bookList.get(i));
            }
        }
        return fil;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> fil = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPublisher().equals(genre)){
                fil.add(bookList.get(i));
            }
        }
        return fil;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> fil = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPublisher().equals(author)){
                fil.add(bookList.get(i));
            }
        }
        return fil;
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
