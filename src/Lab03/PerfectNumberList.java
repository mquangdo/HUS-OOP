package Lab03;

import java.util.Scanner;

public class PerfectNumberList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testPerfectNumberList();
    }
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    public static void testPerfectNumberList() {
        int countPerfect = 0;
        int countAnother = 0;
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();
        try {
            if (upper <= 0) {
                throw new Exception("The upper value must be a positive Integer!");
            } else {
                System.out.println("These perfect numbers are: ");
                for (int i = 1; i <= upper; i++) {
                    if (isPerfect(i)) {
                        countPerfect++;
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                System.out.println(countPerfect + " numbers are found " + '(' + (countPerfect / upper) * 100.0 + ")%");

                System.out.println("These numbers are neither deficient nor perfect: ");
                for (int i = 1; i <= upper; i++) {
                    if (!(isPerfect(i) || isDeficient(i))) {
                        countAnother++;
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                System.out.println(countAnother + " numbers are found " + '(' + (countAnother / upper) * 100 + ")%");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
