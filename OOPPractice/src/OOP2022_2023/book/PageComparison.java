package OOP2022_2023.book;

public class PageComparison implements BookComparator{
    @Override
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
