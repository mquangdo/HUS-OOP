package midterm.year2122.de2.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[minIdx]){
                    minIdx = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIdx];
            data[minIdx] = temp;
            count++;
        }
        return count;
    }
}
