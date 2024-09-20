package OOP2021_2022_de2.sortstrategy;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();

        Random random = new Random();
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(11);
        }
        int[] data2 = data.clone();
        int[] data3 = data.clone();

        System.out.println(Arrays.toString(data));

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.println("Before sorting: " + Arrays.toString(data));
        int count = bubbleSort.sort(data);
        System.out.println("After sorting: " + Arrays.toString(data));
        System.out.println("Number of swap: " + count);


        System.out.println("Using Selection Sort Algorithm:");
        System.out.println("Before sorting: " + Arrays.toString(data2));
        int count2 = selectionSort.sort(data2);
        System.out.println("After sorting: " + Arrays.toString(data2));
        System.out.println("Number of swap: " + count2);

        System.out.println("Using Insertion Sort Algorithm:");
        System.out.println("Before sorting: " + Arrays.toString(data3));
        int count3 = insertionSort.sort(data3);
        System.out.println("After sorting: " + Arrays.toString(data3));
        System.out.println("Number of swap: " + count3);


        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
