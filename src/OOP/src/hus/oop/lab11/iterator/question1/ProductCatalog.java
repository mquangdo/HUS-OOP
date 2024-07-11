package hus.oop.lab11.iterator.question1;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;

    public ProductCatalog(String[] productCatalog){
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog);
    }
}
