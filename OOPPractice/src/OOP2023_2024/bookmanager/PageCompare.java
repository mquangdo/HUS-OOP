package OOP2023_2024.bookmanager;

public class PageCompare implements MyBookComparator{
    @Override
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
