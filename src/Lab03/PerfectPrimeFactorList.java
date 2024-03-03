package Lab03;

import java.util.Scanner;

public class PerfectPrimeFactorList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testPerfectPrimeFactorList();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(number) + 1; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int number) {
        int prod = 1;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                prod *= i;
            }
        }
        return prod == number;
    }

    public static void testPerfectPrimeFactorList() {
        System.out.print("Enter the upper bound: ");
        int number = sc.nextInt();
        double count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 2; i <= number; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("[" + count + " numbers found (" + (count * 100.0) / number + "%)]");
    }
}
