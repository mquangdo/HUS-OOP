package hus.oop.lab11.iterator.example.example1;
import java.util.*;

public class Cafe {
    public static void main(String[] args) {
        System.out.println("=== Breakfast Menu ===");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i));
        }

        System.out.println("=== Dinner Menu ===");
        DinnerMenu dinnerMenu = new DinnerMenu();
        String[] lunchItems = dinnerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            System.out.println(lunchItems[i]);
        }

        ///With iterator
        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("=== Breakfast Menu with iterator ===");
        printMenu(pancakeHouseMenu);
        System.out.println("=== Dinner Menu with iterator ===");
        printMenu(dinnerMenu);
    }

    private static void printMenu(Menu menu){
        Iterator iterator = menu.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
