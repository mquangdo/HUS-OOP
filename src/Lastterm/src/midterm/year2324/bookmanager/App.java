package midterm.year2324.bookmanager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static final BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
        testSortIncreasingTitleAndPrice();
        testSortDecreasingTitleAndPrice();
        testPriceOfBooksIncreasing();
        testPriceOfBooksDecreasing();
        testFilterBooksLowestPrice();
        testFilterBooksHighestPrice();
        testFilterBooksOfAuthor();
        testFilterBooksOfPublisher();
        testFilterBooksOfGenre();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BookManager>.txt (Ví dụ, NguyenVanA_123456_BookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookManager>.zip (Ví dụ, NguyenVanA_123456_BookManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "src/midterm/year2324/data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào bookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
                String title = dataList.get(0);
                String author = dataList.get(1);
                String genre = dataList.get(2);
                int pages = Integer.parseInt(dataList.get(3));
                double price = Double.parseDouble(dataList.get(4));
                String publish = dataList.get(5);

                Book book = new Book.BookBuilder(title).withAuthor(author).withGenre(genre).withPages(pages).withPrice(price).withPublisher(publish).build();
                bookManager.insertAtEnd(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        System.out.println("testOriginalData:");
        List<Book> books = bookManager.getBookList();
        System.out.print(books);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingTitleAndPrice() {
        /* TODO */
        System.out.println("\ntestSortIncreasingTitleAndPrice:");
        List<Book> list = bookManager.sortIncreasingTitleAndPrice();
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo tiêu chí, đầu tiên theo title giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingTitleAndPrice() {
        /* TODO */
        System.out.println("\ntestSortDecreasingTitleAndPrice:");
        List<Book> list = bookManager.sortDecreasingTitleAndPrice();
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        /* TODO */
        System.out.println("\ntestPriceOfBooksIncreasing:");
        List<Book> list = bookManager.sortIncreasingPrice();
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test sắp xếp book theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        /* TODO */
        System.out.println("\ntestPriceOfBooksDecreasing:");
        List<Book> list = bookManager.sortDecreasingPrice();
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        /* TODO */
        System.out.println("\ntestFilterBooksLowestPrice: 5 books");
        List<Book> list = bookManager.filterLowestPrice(5);
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test lọc ra những book có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
        /* TODO */
        System.out.println("\ntestFilterBooksHighestPrice: 5 books");
        List<Book> list = bookManager.filterHighestPrice(5);
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        System.out.println("\ntestFilterBooksOfAuthor: McKinney Wes");
        List<Book> list = bookManager.filterBooksOfAuthor("McKinney Wes");
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        System.out.println("\ntestFilterBooksOfPublisher: Wiley");
        List<Book> list = bookManager.filterBooksOfPublisher("Wiley");
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        System.out.println("\ntestFilterBooksOfGenre: data_science");
        List<Book> list = bookManager.filterBooksOfGenre("data_science");
        String string = BookManager.titleOfBooksToString(list);
        System.out.println(string);
        System.out.println();
    }
}
