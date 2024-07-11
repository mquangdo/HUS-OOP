package lastterm.year2324.search;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */
        int max = 30;
        int min = 20;
        int range = (max - min) + 1;
        int num = (int)(Math.random() * range) + min;
        System.out.println("The length of array: " + num);
        double[] arr = new double[num];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * range);
        }

        double[] arr2 = Arrays.copyOf(arr, arr.length);
        double[] arr3 = Arrays.copyOf(arr, arr.length);
        int index;

        System.out.println("\nThe original array:");
        System.out.println(Arrays.toString(arr));

        BinarySearch binarySearch = BinarySearch.getInstance();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("\nUsing Bubble Sort Algorithm:");
        binarySearch.setSorter(bubbleSort);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
        index = binarySearch.search(arr, 1.0);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Binary search found 1.0 at index: " + index);

        System.out.println("\nUsing Selection Sort Algorithm:");
        binarySearch.setSorter(selectionSort);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr2));
        index = binarySearch.search(arr2, 11.0);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Binary search found 11.0 at index: " + index);

        System.out.println("\nUsing Insertion Sort Algorithm:");
        binarySearch.setSorter(insertionSort);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr3));
        index = binarySearch.search(arr3, 5.0);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Binary search found 5.0 at index: " + index);


    }
}
