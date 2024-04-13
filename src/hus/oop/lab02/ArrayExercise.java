package hus.oop.lab02;

import java.io.IOException;
import java.util.Scanner;

public class ArrayExercise {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] arr = createArray();
//        printArray(arr);
//        System.out.println();
//        int[] studentGrades = generateStudentGrade(in);
//        simpleGradesStatistics(studentGrades);
//        testHexadecimalToBinary();
        testDecimalToHexadecimal();

    }
    //2.1
    public static int[] createArray() {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }
        return items;
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

    //2.2
    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter  the number of students: ");

        int numStudent = in.nextInt();
        int[] studentGrade = new int[numStudent];

        for (int i = 0; i < numStudent; i++) {
            try {
                System.out.println("The grade of student " + (i + 1) + " is: ");
                int grade = in.nextInt();
                studentGrade[i] = grade;
                if (grade < 0 || grade > 100) {
                    throw new IOException("The grade is not in the range 0-100" + '\n');
                }
            }
            catch (IOException e) {
                System.out.print(e);
                i--;
            }
        }
        return studentGrade;
    }

    public static void simpleGradesStatistics(int[] grades) {
        double averageGrade = 0;
        int minimumGrade = Integer.MAX_VALUE;
        int maximumGrade = Integer.MIN_VALUE;

        for (int i = 0; i < grades.length; i++) {
            averageGrade += grades[i];
            if (grades[i] > maximumGrade) {
                maximumGrade = grades[i];
            } else if (grades[i] < minimumGrade) {
                minimumGrade = grades[i];
            }
        }

        averageGrade = averageGrade / grades.length;

        System.out.println("The average is: " + averageGrade);
        System.out.println("The maximum is: " + maximumGrade);
        System.out.println("The minimum is: " + minimumGrade);
    }

    //2.3
    public static String hexadecimalToBinary(String hexStr){
        String result = "";
        final String HEX_STRS = "0123456789abcdef";
        final String[] HEX_BITS = {"0000", "0001", "00010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        for (int i = 0 ; i < hexStr.length(); i++){
            char character = hexStr.charAt(i);
            result += HEX_BITS[HEX_STRS.indexOf(character)] + " ";
        }
        return result;
    }

    public static void testHexadecimalToBinary(){
        System.out.print("Enter a hex string: ");
        String hexStr = in.nextLine();
        System.out.print("The binary of the hex string is: " + hexadecimalToBinary(hexStr));
    }

    //2.4
    public static String decimalToHexadecimal(int positiveInteger){
        final String hexChars = "0123456789ABCDEF";
        String hex = "";
        while (positiveInteger > 0) {
            hex = hexChars.charAt(positiveInteger % 16) + hex;
            positiveInteger /= 16;
        }
        return hex;
    }

    public static void testDecimalToHexadecimal(){
        System.out.println("Enter a decimal number: ");
        int value = in.nextInt();
        System.out.println("The hexadecimal is: " + decimalToHexadecimal(value));
    }
}
