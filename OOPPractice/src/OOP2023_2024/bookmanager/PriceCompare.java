package OOP2023_2024.bookmanager;



public class PriceCompare implements MyBookComparator{
    @Override
    public int compare(Book left, Book right) {
        return Double.compare(left.getPrice(), right.getPrice());
    }
}
