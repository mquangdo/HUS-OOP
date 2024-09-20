package midterm2022.quest2;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements ISort {
    public static void main(String[] args) {
        int[] a = {2,3,1};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
    }
    public SelectionSort(){

    }

    @Override
    public int sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return 1;
    }
}
