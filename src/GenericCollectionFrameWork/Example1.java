package GenericCollectionFrameWork;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Example1 {
    public static void main(String[] args) {
        testList();
    }
    public static void testList(){
        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("latte");
        coffeeList.add("espresso");
        System.out.println(coffeeList);

        Iterator<String> iter = coffeeList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
