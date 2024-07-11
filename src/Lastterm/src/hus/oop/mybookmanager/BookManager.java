package hus.oop.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        /* TODO */
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null){
            instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        /* TODO */
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        /* TODO */
        bookList.insertAtPosition(book, index);
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
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return (Book) bookList.get(index);
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() > max) {
                max = book.getPrice();
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() == max) {
                return book;
            }
        }
        return null;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() < min) {
                min = book.getPrice();
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() == min) {
                return book;
            }
        }
        return null;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPages() > max) {
                max = book.getPrice();
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() == max) {
                return book;
            }
        }
        return null;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPages() < min) {
                min = book.getPrice();
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookAt(i);
            if (book.getPrice() == min) {
                return book;
            }
        }
        return null;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList list = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++){
            Book book = bookAt(i);
            if (book.getPublisher().equals(publisher)){
                list.insertAtEnd(book);
            }
        }
        return list;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList list = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++){
            Book book = bookAt(i);
            if (book.getGenre().equals(genre)){
                list.insertAtEnd(book);
            }
        }
        return list;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList list = new MyLinkedList();
        for (int i = 0; i < bookList.size(); i++){
            Book book = bookAt(i);
            if (book.getAuthor().equals(author)){
                list.insertAtEnd(book);
            }
        }
        return list;
    }
}
