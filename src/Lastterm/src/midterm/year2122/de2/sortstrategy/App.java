package midterm.year2122.de2.sortstrategy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /* TODO */
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
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random() * 10);
        }
        System.out.println("Original array:");
        System.out.println(print(arr1));

        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        int num;

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        SortStrategy sortStrategy = SortStrategy.getInstance();

        System.out.println("\nUsing Bubble Sort Algorithm:");
        System.out.println("Before sorting:");
        System.out.println(print(arr1));
        sortStrategy.setSortee(bubbleSort);
        num = sortStrategy.sort(arr1);
        System.out.println("After sorting:");
        System.out.println(print(arr1));
        System.out.println("Number of swap: " + num);

        System.out.println("\nUsing Selection Sort Algorithm:");
        System.out.println("Before sorting:");
        System.out.println(print(arr2));
        sortStrategy.setSortee(selectionSort);
        num = sortStrategy.sort(arr2);
        System.out.println("After sorting:");
        System.out.println(print(arr2));
        System.out.println("Number of swap: " + num);

        System.out.println("\nUsing Insertion Sort Algorithm:");
        System.out.println("Before sorting:");
        System.out.println(print(arr3));
        sortStrategy.setSortee(insertionSort);
        num = sortStrategy.sort(arr3);
        System.out.println("After sorting:");
        System.out.println(print(arr3));
        System.out.println("Number of swap: " + num);

    }

    public static String print(int[] data){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < data.length - 1; i++){
            sb.append(data[i]).append(" ");
        }
        sb.append(data[data.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
