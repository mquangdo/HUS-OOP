package hus.oop.lab03;
import java.util.Arrays;
import java.util.Scanner;

public class ExercisesOnAlgorithmSortingAndSearching {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,11,14,16,20,30,35,52,56};
        int[] b = {10,14,37,14,6,2,4};
//        testLinearSearch(arr);
////        testBubbleSort(arr);
////        testSelectionSort(arr);
//        testInsertionSort(arr);
        insertionSort(b);
        System.out.println(binarySearch(arr, 7));


    }

    //2.1
    public static boolean linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void testLinearSearch(int[] arr){
        System.out.println("The array is: ");
        printArray(arr);
        int number = sc.nextInt();
        if(linearSearch(arr, number)){
            System.out.println("The array contains this key");
        }
        else {
            System.out.println("The array does not contain this key");
            System.out.println("The index is " + linearSearchIndex(arr, number));
        }
    }

    public static int linearSearchIndex(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (linearSearch(array, key)){
                if (array[i] == key){
                    return i;
                }
            }
        }
        return -1;
    }

    //2.2
    public static boolean binarySearch(int[] array, int key, int fromIndex, int toIndex){
        if (fromIndex == toIndex - 1) {
            if (array[fromIndex] == key) {
                return true;
            }
            return false;
        }
        int middleIndex = (fromIndex + toIndex) / 2;
        int middleElement = array[middleIndex];
        if (key == middleElement) {
            return true;
        } else if (key < middleElement) {
            return binarySearch(array, key, fromIndex, middleIndex);
        } else {
            return binarySearch(array, key, middleIndex + 1, toIndex);
        }
    }
    public static boolean binarySearch(int[] array, int key){
        int left = 0, right = array.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            if(array[middle] == key){
                return true;
            }
            if(array[middle] < key){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return false;
    }
    public static void testBinarySearch(int[] array){
        System.out.print("Enter your key: ");
        int key = sc.nextInt();
        System.out.println(binarySearch(array,key,0,array.length));
        System.out.println(binarySearch(array,key));
    }

    //2.3
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void testBubbleSort(int[] arr){
        System.out.println("The array is");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("The sorted array is: ");
        printArray(arr);
    }


    //2.4

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void testSelectionSort(int[] arr){
        System.out.println("The array is");
        printArray(arr);
        selectionSort(arr);
        System.out.println("The sorted array is: ");
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;
        }
    }
    public static void testInsertionSort(int[] arr){
        System.out.println("The array is");
        printArray(arr);
        insertionSort(arr);
        System.out.println("The sorted array is: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("The values are: ");
        System.out.print('[');
        for(int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.print(']');
    }
}
