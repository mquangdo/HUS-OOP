package oop.hus.oop.bookmanager;

public class SortTitleAndPrice implements MyBookComparator{
    @Override
    public int compare(Book left, Book right) {
        if (left.getTitle().equals(right.getTitle())){
            return Double.compare(right.getPrice(), left.getPrice());
        }
        return left.getTitle().compareTo(right.getTitle());
    }
}
