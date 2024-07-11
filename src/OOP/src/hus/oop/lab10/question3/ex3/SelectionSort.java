package hus.oop.lab10.question3.ex3;

public class SelectionSort implements Sort{
    @Override
    public int[] sort(int[] a) {
        int[] array = a.clone();
        for (int i = 0; i < a.length - 1; i++){
            int minPos = i;
            for (int j = i + 1; j < a.length; j++){
                if (array[j] < array[minPos]){
                    minPos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
        return array;
    }
}
