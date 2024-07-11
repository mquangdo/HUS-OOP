package midterm.year2324.bookmanager;

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
        if (checkBoundaries(index, bookList.size())){
            bookList.add(index, book);
        };
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        if (checkBoundaries(index, bookList.size() - 1)){
            bookList.remove(index);
        }
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
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
        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (book1.compareTo(book2) > 0){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        /* TODO */
        MyBookComparator comparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getTitle().equals(right.getTitle())){
                    if (left.getPrice() < right.getPrice()){
                        return 1;
                    }
                    else if (left.getPrice() > right.getPrice()){
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
                return left.getTitle().compareTo(right.getTitle());
            }
        };

        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (comparator.compare(book1, book2) > 0){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        /* TODO */
        MyBookComparator comparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getTitle().equals(right.getTitle())){
                    if (left.getPrice() < right.getPrice()){
                        return 1;
                    }
                    else if (left.getPrice() > right.getPrice()){
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
                return right.getTitle().compareTo(left.getTitle());
            }
        };

        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (comparator.compare(book1, book2) > 0){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (book1.getPrice() > book2.getPrice()){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (book1.getPrice() < book2.getPrice()){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (book1.getPages() > book2.getPages()){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        for (int i = 0; i < bookList.size() - 1; i++){
            for (int j = i + 1; j < bookList.size(); j++){
                Book book1 = bookAt(i);
                Book book2 = bookAt(j);
                if (book1.getPages() < book2.getPages()){
                    Book temp = book1;
                    bookList.set(i, book2);
                    bookList.set(j, temp);
                }
            }
        }
        return bookList;
    }

    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        List<Book> book = sortDecreasingPrice();
        for (int i = 0; i < howMany; i++){
            res.add(book.get(i));
        }
        return res;
    }

    public List<Book> filterLowestPrice(int howMany) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        List<Book> book = sortIncreasingPrice();
        for (int i = 0; i < howMany; i++){
            res.add(book.get(i));
        }
        return res;
    }

    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPrice() >= lowerBound){
                res.add(bookList.get(i));
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        List<Book> book = sortIncreasingPages();
        for (int i = 0; i < howMany; i++){
            res.add(book.get(i));
        }
        return res;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPages() <= upperBound){
                res.add(bookList.get(i));
            }
        }
        return res;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getPublisher().equals(publisher)){
                res.add(bookList.get(i));
            }
        }
        return res;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getGenre().equals(genre)){
                res.add(bookList.get(i));
            }
        }
        return res;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getAuthor().equals(author)){
                res.add(bookList.get(i));
            }
        }
        return res;
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
