package Exercise4;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inNumber = in.nextInt();

        int reverseNumber = reverseNumber(inNumber);
        System.out.println(reverseNumber);
    }

    public static int reverseNumber(int inNumber) {
        int reverseNumber = 0;
        while (inNumber > 0) {
            reverseNumber = reverseNumber * 10 + inNumber % 10;
            inNumber /= 10;
        }
        return reverseNumber;
    }

}
