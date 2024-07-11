package hus.oop.lab01;
import java.util.Scanner;

public class ArrayHomework {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        printArrayInStars(in);
    }


    //4.1
    public static void printArrayInStars(Scanner in){
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] arr = new int[NUM_ITEMS];
        System.out.println("Enter the value of all items: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i]; j++){
                System.out.print('*');
            }
            System.out.print("(" + arr[i] + ")");
            System.out.println();
        }
    }
}

