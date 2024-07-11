package lastterm.year2324.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        instance = null;
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        if(instance == null)
            instance = new BookManager();
        return instance;
    }

    public MyList getBookList() {
        return  this.bookList;
    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        MyIterator iter = bookList.iterator();
        Book currentBook = null;
        for(int i = 0; i < index && iter.hasNext(); i++){
            currentBook = (Book)iter.next();
        }
        return currentBook;
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        Book bestBook = null;
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(bestBook == null)
                bestBook = currentBook;
            else if(bestBook.getPrice() < currentBook.getPrice())
                bestBook = currentBook;
        }
        return  bestBook;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        Book bestBook = null;
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(bestBook == null)
                bestBook = currentBook;
            else if(bestBook.getPrice() > currentBook.getPrice())
                bestBook = currentBook;
        }
        return  bestBook;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        Book bestBook = null;
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(bestBook == null)
                bestBook = currentBook;
            else if(bestBook.getPages() < currentBook.getPages())
                bestBook = currentBook;
        }
        return  bestBook;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        Book bestBook = null;
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(bestBook == null)
                bestBook = currentBook;
            else if(bestBook.getPages() > currentBook.getPages())
                bestBook = currentBook;
        }
        return  bestBook;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        MyList newList = new MyLinkedList();
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(currentBook.getPublisher().equals(publisher))
                newList.insertAtEnd(currentBook);
        }
        return  newList;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        MyList newList = new MyLinkedList();
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(currentBook.getGenre().equals(genre))
                newList.insertAtEnd(currentBook);
        }
        return  newList;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        MyList newList = new MyLinkedList();
        for(int id = 0; id < bookList.size(); id++){
            Book currentBook = bookAt(id);
            if(currentBook.getAuthor().equals(author))
                newList.insertAtEnd(currentBook);
        }
        return  newList;
    }
}
