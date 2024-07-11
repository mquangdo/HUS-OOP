package midterm.year2122.de2.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length - 1; i++){
            for (int j = i + 1; j < data.length; j++){
                if (data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
