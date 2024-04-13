package OOPExample;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSort(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[min]){
                    int temp = min;
                    min = j;
                    j = temp;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
