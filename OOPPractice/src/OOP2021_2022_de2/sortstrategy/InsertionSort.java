package OOP2021_2022_de2.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length; i++){
            int j = i - 1;
            int key = data[i];
            while (j >= 0 && data[j] > key){
                data[j + 1] = data[j];
                count++;
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return count;
    }
}
