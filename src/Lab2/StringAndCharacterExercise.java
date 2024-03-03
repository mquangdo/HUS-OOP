package Lab2;

import java.util.Scanner;

public class StringAndCharacterExercise {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
        testCipherCaesarCode();
        testDecipherCaesarCode();
        testHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
        testRadixNToDecimal();
        testHexadecimalToDecimal();
    }

    //1.1
    public static String reverseString(String inStr) {
        String res = "";
        int length = inStr.length();
        for (int i = length - 1; i >= 0; i--) {
            res = res + inStr.charAt(i);
        }
        System.out.print("The reversed String is: ");
        return res;
    }

    public static void testReverseString() {
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(reverseString(input));
    }

    public static int countDigits(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }

    public static int countVowels(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char x = inStr.charAt(i);
            if (x == 'a' || x == 'u' || x == 'e' || x == 'i' || x == 'o') {
                count++;
            }
        }
        return count;
    }

    public static void testCountVowelsDigits() {
        System.out.print("Enter a String: ");
        String str = sc.next().toLowerCase();
        double countVowels = countVowels(str);
        double countDigits = countDigits(str);
        System.out.println("Number of vowels: " + countVowels + " " + "(" + Math.round(countVowels / str.length() * 100) / 100.0 + "%)");
        System.out.println("Number of digits: " + countDigits + " " + "(" + Math.round(countDigits / str.length() * 100) / 100.0 + "%)");
    }

    //1.3

    public static String phoneKeyPad(String inStr) {
        String res = "";
        int length = inStr.length();
        for (int i = 0; i < length; i++) {
            char letter = inStr.charAt(i);
            if (letter == 'A' | letter == 'B' | letter == 'C') {
                res += '2';
            } else if (letter == 'D' | letter == 'E' | letter == 'F') {
                res += '3';
            } else if (letter == 'G' | letter == 'H' | letter == 'I') {
                res += '4';
            } else if (letter == 'J' | letter == 'K' | letter == 'L') {
                res += '5';
            } else if (letter == 'M' | letter == 'N' | letter == 'O') {
                res += '6';
            } else if (letter == 'P' | letter == 'Q' | letter == 'R' | letter == 'S') {
                res += '7';
            } else if (letter == 'T' | letter == 'U' | letter == 'V') {
                res += '8';
            } else {
                res += '9';
            }
        }
        return res;
    }

    public static String phoneKeyPad2(String inStr) {
        String res = "";
        for (int i = 0; i < inStr.length() - 1; i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    res += 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    res += 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    res += 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    res += 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    res += 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    res += 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    res += 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    res += 9;
                    break;
            }
        }
        return res;
    }

    public static void testPhoneKeyPad() {
        System.out.println("The input String is: ");
        String input = sc.nextLine();
        System.out.println("The sequence is(using if-else): " + phoneKeyPad(input));
        System.out.println("The sequence is(using switch-case): " + phoneKeyPad2(input));
    }

    //1.4
    public static String cipherCaesarCode(String inStr) {
        String result = "";
        int length = inStr.length();
        for (int i = 0; i < length; i++) {
            if ((int) inStr.charAt(i) <= 87) {
                result += (char) ((int) inStr.charAt(i) + 3);
            } else {
                result += (char) ((int) inStr.charAt(i) - 26 + 3);
            }
        }
        return result;
    }

    public static void testCipherCaesarCode() {
        System.out.println("Enter a String: ");
        String input = sc.next().toUpperCase();
        String result = cipherCaesarCode(input);
        System.out.println("The ciphertext is: " + result);
    }

    //1.5
    public static String decipherCaesarCode(String inStr) {
        String result = "";
        int length = inStr.length();
        for (int i = 0; i < length; i++) {
            if ((int) inStr.charAt(i) > 67) {
                result += (char) ((int) inStr.charAt(i) - 3);
            } else {
                result += (char) ((int) inStr.charAt(i) + 26 - 3);
            }
        }
        return result;
    }

    public static void testDecipherCaesarCode() {
        System.out.println("Enter a String: ");
        String input = sc.next().toUpperCase();
        String result = decipherCaesarCode(input);
        System.out.println("The ciphertext is: " + result);
    }

    //1.6
    public static boolean isHexString(String hexStr) {
        for (int i = 0; i < hexStr.length(); i++) {
            char character = hexStr.charAt(i);
            if (!((character >= '0' && character <= '9') || (character >= 'a' && character <= 'f') || (character >= 'A' && character <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString() {
        System.out.println("Enter a hex string");
        String input = sc.nextLine();
        if (isHexString(input)) {
            System.out.println(input + " this is a hex string");
        } else {
            System.out.println(input + " this is not a hex string!");
        }
    }

    //1.7
    public static int binaryToDecimal(String binStr) {
        int decimal = 0;
        for (int i = 0; i < binStr.length(); i++) {
                decimal = decimal * 2 + binStr.charAt(i) - 48;
        }
        return decimal;
    }

    public static void testBinaryToDecimal() {
        System.out.println("Enter a binary string: ");
        String binary = sc.nextLine();
        if (testValidBinaryString(binary)) {
            int result = binaryToDecimal(binary);
            System.out.println("The number is: " + result);
        } else {
            System.out.println("error: This is not a binary string!");
        }
    }

    public static boolean testValidBinaryString(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    //1.8

    public static int hexadecimalToDecimal(String hexStr) {
        final String hexChars = "0123456789ABCDEF";
        int decimal = 0;
        for (int i = 0; i < hexStr.length(); i++){
            char charAtIdx = hexStr.charAt(i);
            int pos = hexChars.indexOf(charAtIdx);
            decimal = decimal * 16 + pos;
        }
        return decimal;
    }

    public static void testHexadecimalToDecimal() {
        System.out.print("Enter a Hexadecimal string: ");
        String str = sc.next();
        if (hexadecimalToDecimal(str) == '2') {
            System.out.println("Error: invalid hexadecimal string \"" + str + "\"");
        } else {
            System.out.println("The equivalent decimal number for hexadecimal \"" + str + "\" is: " + hexadecimalToDecimal(str));
        }
    }

    //1.9
    public static int octalToDecimal(String hexStr) {
        int decimal = 0;
        for (int i = 0; i < hexStr.length(); i++) {
            int test = hexStr.charAt(i); // tu dong dua ve ma ASCII
            decimal = decimal * 8 + test - 48;
        }
        return decimal;
    }

    public static boolean testValidOctalString(String octalStr) {
        for (int i = 0; i < octalStr.length(); i++) {
            if (octalStr.charAt(i) > '7' || octalStr.charAt(i) < '0') {
                return false;
            }
        }
        return true;
    }
    public static void testOctalToDecimal() {
        System.out.println("Enter an Octal string: ");
        String input = sc.nextLine();
        if (testValidOctalString(input)) {
            System.out.println("The equivalent decimal number is: " + octalToDecimal(input));
        } else {
            System.out.println("error: This is not an Octal string!");
        }
    }

    //10
    public static int radixNToDecimal(String radixNStr, int num) {
        int decimal = 0;
        for (int i = 0; i < radixNStr.length(); i++) {
            int test = radixNStr.charAt(i); // tu dong dua ve ma ASCII
            decimal = decimal * num + test - 48;
        }
        return decimal;
    }

    public static void testRadixNToDecimal() {
        System.out.print("Enter the radix: ");
        int x = sc.nextInt();
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.println("The equivalent decimal number " + str + " is: " + radixNToDecimal(str, x));
    }
}
