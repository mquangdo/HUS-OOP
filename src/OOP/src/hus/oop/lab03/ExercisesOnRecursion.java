package hus.oop.lab03;

import java.util.Scanner;

public class ExercisesOnRecursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        testFactorial();
        testFibonacci();
        testLen();
        testGCD();
    }

    //1.1
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void testFactorial(){
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The factorial is " + factorial(number));
    }

    //1.2
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void testFibonacci(){
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The fibonacci number " + fibonacci(number));
    }

    //1.3
    public static String len(int n){
        if (n == 1){
            return "1";
        }
        return len(n - 1) + n;
    }

    public static void testLen(){
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The len is: " + len(number));
    }

    //1.4
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, remainder(a, b));
    }

    public static void testGCD(){
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("The GCD of these 2 numbers is: " + gcd(a, b));
    }

    public static int remainder(int a, int b){
        if (a > b){
            return a - b;
        } else if (b > a) {
            return b - a;
        }
        return 0;
    }
}
