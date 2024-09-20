package week7;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
