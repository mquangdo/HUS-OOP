package Lab2;

import java.util.Scanner;

public class MethodExercise {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,9};

        testExponent();
        testMagicSum();
        testPrint(arr1);
        testArrayToString(arr1);
        testContains(arr1, 11);
        testSearch(arr1, 10);
        testEquals(arr1, arr2);
        testCopyOf(arr1);
        testSwap(arr1, arr2);
        testSwap(arr1, arr2);
    }

    //3.1
    public static int exponent(int base, int exp){
        int result = 1;
        for(int i = 1; i <= exp; i++){
            result *= base;
        }
        return result;
    }


    public static void testExponent(){
        System.out.println("Enter the base: ");
        int base = in.nextInt();

        System.out.println("Enter the exp: ");
        int exp = in.nextInt();

        System.out.println("The base is: " + base);
        System.out.println("The exp is: " + exp);
        System.out.println(base + " raise to the power of " + exp + " is: " + exponent(3, 4));

    }

    //3.2

    public static boolean hasEight(int number){
        while (number > 0){
            int temp = number;
            temp %= 10;
            if (temp == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int magicSum(){
        final int SENTINAL = -1;
        int number;
        int magicSum = 0;


        do {
            System.out.println("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (hasEight(number)){
                magicSum += number;
            }
        }
        while (number != SENTINAL);

        return magicSum;
    }
    public static void testMagicSum(){
        int magicSum = magicSum();
        System.out.println("The magic sum is: " + magicSum);
    }

    //3.3

    public static void print(int[] arr){
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

    public static void testPrint(int[] arr){
        System.out.print("The array is: ");
        print(arr);
    }

    public static void print(double[] arr){
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

    public static void print(float[] arr){
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

    //3.4
    public static String arrayToString(int[] arr){
        String result = "";
        result += '[';
        for(int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                result += arr[i];
            }
            else
                result += arr[i]  + ", ";
        }
        result += ']';
        return result;
    }

    public static void testArrayToString(int[] arr){
        String result = arrayToString(arr);
        System.out.print("The array is: " + result);
    }

    //3.5
    public static boolean contains(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
               return true;
            }
        }
        return false;
    }

    public static void testContains(int[] arr, int key){
        boolean contain = contains(arr, key);
        if (contain){
            System.out.print("The array contains " + key);
        }
        else {
            System.out.print("The array does not contain " + key);
        }
    }

    //3.6
    public static int search(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void testSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (i == search(arr, key)){
                System.out.println("The position of " + key + " is " + search(arr, key));
            }
        }
        if (search(arr, key) == -1){
            System.out.println("The position does not contain this key!");
        }
    }

    //3.7
    public static boolean equals(int[] arr1, int[] arr2){
        try {
            int length1 = arr1.length;
            int length2 = arr2.length;

            if (length1 != length2){
                throw new Exception("The lengths of 2 arrays must be equal to compare!");
            }
            else {
                for (int i = 0; i < arr1.length; i++){
                    if (arr1[i] != arr2[i]){
                        return false;
                    }
                }
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public static void testEquals(int[] arr1, int[] arr2){
        if (equals(arr1, arr2)){
            System.out.println("The 1st array is equal to the 2nd array");
        }
        else {
            System.out.println("The 1st array is not equal to the 2nd array!");
        }
    }

    //3.8
    public static int[] copyOf(int[] arr){
        int[] copiedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            copiedArray[i] = arr[i];
        }
        return copiedArray;
    }

    public static void testCopyOf(int[] arr){
        int[] copiedArray = copyOf(arr);
        System.out.print("The copy array is: ");
        print(arr);
    }

    //3.9
    public static boolean swap(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        else {
            for (int i = 1; i < arr1.length; i++){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
        return true;
    }

    public static void testSwap(int[] arr1, int[] arr2){
        if (swap(arr1, arr2)){
            System.out.println("The 2 arrays have been swapped successfully");
        }
        else {
            System.out.println("The lengths of the 2 arrays are not equal");
        }
    }

    //3.10

    public static int[] reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    public static void testReverse(int[] arr){
        int[] reversedArray = reverse(arr);
        System.out.print("The reversed array is: ");
        print(reversedArray);
    }

}
