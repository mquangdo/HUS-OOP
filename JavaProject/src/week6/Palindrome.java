package week6;

import java.util.Scanner;

public class Palindrome
{
    public static boolean isPalindrome(int n)
    {
        //begin edit
        int s = 0;
        int temp = n;
        int a;
        while (temp > 0){
            a = temp % 10;
            s = s * 10 + a;
            temp = temp / 10;
        }
        if (s == n){
            return true;
        }
        else {
            return false;
        }

        //end edit
    }

    public static void main(String args[])
    {
        System.out.println(isPalindrome(123454321));

    }

}