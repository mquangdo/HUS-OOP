package lastterm.year2324.mybookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        String filePath = "data/books.csv";
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

                Book newBook = new Book.BookBuilder(dataList.get(0))
                        .withAuthor(dataList.get(1))
                        .withPublisher(dataList.get(2))
                        .withGenre(dataList.get(3))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPages(Integer.parseInt(dataList.get(5)))
                        .build();
                BookManager.getInstance().insertAtEnd(newBook);
            }

            // Run test methods
            testFilterBooksOfAuthor();
            testFilterBooksOfPublisher();
            testFilterBooksOfGenre();
            testGetHighestPriceBook();
            testGetLowestPriceBook();
            testGetHighestNumberOfPagesBook();
            testGetLowestNumberOfPagesBook();

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

    public static void testFilterBooksOfAuthor() {
        MyList books = BookManager.getInstance().filterBooksOfAuthor("Author Name");
        MyIterator iter = books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }

    public static void testFilterBooksOfPublisher() {
        MyList books = BookManager.getInstance().filterBooksOfPublisher("Publisher Name");
        MyIterator iter = books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }

    public static void testFilterBooksOfGenre() {
        MyList books = BookManager.getInstance().filterBooksOfGenre("Genre");
        MyIterator iter = books.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }

    public static void testGetHighestPriceBook() {
        Book highestPriceBook = BookManager.getInstance().highestPriceBook();
        System.out.println(highestPriceBook.getTitle()); // or whatever property you want to print
    }

    public static void testGetLowestPriceBook() {
        Book lowestPriceBook = BookManager.getInstance().lowestPriceBook();
        System.out.println(lowestPriceBook.getTitle()); // or whatever property you want to print
    }

    public static void testGetHighestNumberOfPagesBook() {
        Book highestNumberOfPagesBook = BookManager.getInstance().highestNumberOfPagesBook();
        System.out.println(highestNumberOfPagesBook.getTitle()); // or whatever property you want to print
    }

    public static void testGetLowestNumberOfPagesBook() {
        Book lowestNumberOfPagesBook = BookManager.getInstance().lowestNumberOfPagesBook();
        System.out.println(lowestNumberOfPagesBook.getTitle()); // or whatever property you want to print
    }
}
