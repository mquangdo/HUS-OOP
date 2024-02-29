package Homework2;

import java.util.Scanner;

public class StringAndCharacterHomework {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testChangeCipher();
        testPalindromic();
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
}
