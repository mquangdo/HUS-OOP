package hus.oop.lab10.question3.ex3;

public class InsertionSort implements Sort{
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int key = array[j];
            while (j >= 0 && key > array[i]){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
