package oop.hus.oop.bookmanager;

public class SortTitileAndPriceAgain implements MyBookComparator{
    @Override
    public int compare(Book left, Book right) {
        if (left.getTitle().equals(right.getTitle())){
            return Double.compare(right.getPrice(), left.getPrice());
        }
        return right.getTitle().compareTo(left.getTitle());
    }
}
