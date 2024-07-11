package hus.oop.lab10.question3.ex3;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
