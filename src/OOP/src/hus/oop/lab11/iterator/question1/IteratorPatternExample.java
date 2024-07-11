package hus.oop.lab11.iterator.question1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] catalog = {"Freddy Fazbear", "Bonnie", "Chica", "Foxy", "The Puppet", "Balloon Boy", "Purple Guy", "Golden Freddy"};
        ProductCatalog productCatalog = new ProductCatalog(catalog);
        Iterator iterator = productCatalog.getIterator();

        System.out.println("Use Iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUse for loop");
        for (String cata: catalog){
            System.out.println(cata);
        }
    }
}
