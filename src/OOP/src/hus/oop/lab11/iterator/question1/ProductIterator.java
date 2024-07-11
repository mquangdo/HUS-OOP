package hus.oop.lab11.iterator.question1;

public class ProductIterator implements Iterator{
    private String[] productCatalog;
    private int position = 0;
    public ProductIterator(String[] productCatalog){
        this.productCatalog = productCatalog;
    }
    @Override
    public boolean hasNext() {
        if (position >= productCatalog.length || productCatalog[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()){
            String product = productCatalog[position];
            position++;
            return product;
        }
        return null;
    }
}
