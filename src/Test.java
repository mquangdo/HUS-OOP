import Car.Car;
import java.util.Arrays;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.remove("Banana");
        System.out.println(fruits);
        String [] arr = {"Quang", "Linh"};
        double[] values = {1,2,3};
        System.out.println(values.length);
        double[] newValues = Arrays.copyOf(values, 2 * values.length);
        values = newValues;
        System.out.println(values.length);

    }

}
