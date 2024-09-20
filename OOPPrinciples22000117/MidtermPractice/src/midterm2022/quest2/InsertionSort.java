package midterm2022.quest2;

import java.util.Arrays;

public class InsertionSort implements ISort{
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = {2,3,1,2,5,6,1,2,3,4};
        insertionSort.sort(a);
    }
    public InsertionSort(){

    }
    @Override
    public int sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
        return 1;
    }
}
