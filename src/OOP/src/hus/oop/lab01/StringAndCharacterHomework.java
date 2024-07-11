package hus.oop.lab01;

import java.util.Scanner;

public class StringAndCharacterHomework {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        testChangeCipher();
//        testPalindromic();
        System.out.println((int)'D');
    }

    public static String changeCipher(String inStr){
        String res = "";
        for(int i = 0; i < inStr.length(); i++){
            res += (char)(155-inStr.charAt(i));
        }
        return res;
    }
    public static void testChangeCipher(){
        System.out.print("Enter a plaintext string: ");
        String str = sc.next().toUpperCase();
        System.out.println(changeCipher(str));
    }

    public static boolean isPalindromic(String strs){
        int leftPointer = 0;
        int rightPointer = strs.length() - 1;
        while (leftPointer < rightPointer){
            if (strs.charAt(leftPointer) != strs.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static void testPalindromic(){
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindromic(input)){
            System.out.println("Palindromic");
        }
        else {
            System.out.println("Not palindromic!");
        }
    }

    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        int firstIdx = fromIdx;
        int lastIdx = toIdx;
        int middleIdx = (fromIdx + toIdx) / 2;
        if (key == array[middleIdx]){
            return true;
        } else if (key < array[middleIdx]) {
            firstIdx = middleIdx;
        } else if (key > array[middleIdx]){
            lastIdx = middleIdx;
        }
        return binarySearch(array, key, firstIdx, lastIdx);
    }

}
