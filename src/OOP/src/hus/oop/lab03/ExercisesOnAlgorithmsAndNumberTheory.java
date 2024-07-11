package hus.oop.lab03;

import java.util.Scanner;

public class ExercisesOnAlgorithmsAndNumberTheory {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testPerfect();
        testDeficient();
        testGCD();
        testPrime();
    }

    //3.1
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void testPerfect(){
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPerfect(number)){
            System.out.println("This is a perfect number");
        }
        else {
            System.out.println("This is not a perfect number");
        }
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

    public static void testDeficient(){
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isDeficient(number)){
            System.out.println("This is a deficient number");
        }
        else {
            System.out.println("This is not a deficient number");
        }
    }

    public static void PerfectNumberList() {
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

    //3.2

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
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

    public static void PrimeList() {
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

    //3.3
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

    //3.4
    public static int gcd(int a, int b){
        if(a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public static void testGCD(){
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
