package Lab03;

import java.util.Scanner;

public class PrimeList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testPrimeList();
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void testPrime(){
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPrime(number)){
            System.out.println("This is a prime number");
        }
        else {
            System.out.println("This is not a prime number");
        }
    }

    public static void testPrimeList() {
        int countPrime = 0;
        int upper = sc.nextInt();
        try {
            if (upper < 0) {
                throw new Exception("The input must be a positive number!");
            } else {
                for (int i = 0; i <= upper; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                        countPrime++;
                    }
                }
                System.out.println();
                System.out.println(countPrime + " numbers are found " + '(' + (countPrime / upper) * 100.0 + ")%");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
