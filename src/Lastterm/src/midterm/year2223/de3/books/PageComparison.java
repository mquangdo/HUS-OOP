package midterm.year2223.de3.books;

public class PageComparison implements BookComparator{
    @Override
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
