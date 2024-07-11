package lastterm.year2223.de3.bookmanager;

import java.util.*;

public class BookManager {
    // Singleton pattern
    private static BookManager instance;

    private final List<Book> bookList;

    private BookManager() {
        bookList = new LinkedList<>();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public List<Book> getBookList() {
        /* TODO */
        return this.bookList;
    }

    /**
     * Thêm book vào cuối danh sách.
     *
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        this.bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     *
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        this.bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     *
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     *
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        this.bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     *
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return this.bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự số trang tăng dần.
     *
     * @return
     */
    public List<Book> sortPagesIncreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book left, Book right) {
                return left.getPages() - right.getPages();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp book theo thứ tự số trang giảm dần.
     *
     * @return
     */
    public List<Book> sortPagesDecreasing() {
        /* TODO */
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book left, Book right) {
                return right.getPages() - left.getPages();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sách theo thứ tự giá tăng dần.
     *
     * @return
     */
    public List<Book> sortPriceIncreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getPrice() > right.getPrice()) {
                    return 1;
                } else if (left.getPrice() < right.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sách theo thứ tự giá giảm dần.
     *
     * @return
     */
    public List<Book> sortPriceDecreasing() {
        /* TODO */
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book left, Book right) {
                if (left.getPrice() < right.getPrice()) {
                    return 1;
                } else if (left.getPrice() > right.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> books = sortPagesDecreasing();
        List<Book> result = new LinkedList<>();
        for (int index = 0; index < howMany; index++) {
            result.add(books.get(index));
        }
        return result;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     *
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getPages() >= lowerBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> books = sortPagesIncreasing();
        List<Book> result = new LinkedList<>();
        for (int index = 0; index < howMany; index++) {
            result.add(books.get(index));
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     *
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getPages() <= upperBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có giá cao nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterBooksHighestPrice(int howMany) {
        /* TODO */
        List<Book> books = sortPriceDecreasing();
        List<Book> result = new LinkedList<>();
        for (int index = 0; index < howMany; index++) {
            result.add(books.get(index));
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có giá cao hơn lowerBound.
     *
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(int lowerBound) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getPrice() >= lowerBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có giá thấp nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterBooksLowestPrice(int howMany) {
        /* TODO */
        List<Book> books = sortPriceIncreasing();
        List<Book> result = new LinkedList<>();
        for (int index = 0; index < howMany; index++) {
            result.add(books.get(index));
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có giá thấp hơn upperBound.
     *
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPriceLowerThan(double upperBound) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getPrice() <= upperBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     *
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo thể loại.
     *
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getGenre().equals(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo tác giả.
     *
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> result = new LinkedList<>();
        for (Book book : this.bookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n");
    }
}
