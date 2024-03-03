package Homework2;

import java.util.Scanner;

public class MathLibraryHomework {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        testTrigonometric();
//        testSpecialSeries();
//        factorialInt();
//        fibonacciInt();
        fibonacciInt();

    }

    //5.1
    public static double sin(double x, int numTerms){
        x = Math.toRadians(x);
        double res = 0;
        double numerator = x;
        double denominator = 1;
        for (int num = 1; num <= numTerms; num++){
            res += numerator / denominator;
            numerator *= (-1) * x * x;
            denominator *= (2 * num) * (2 * num + 1);
        }
        return res;
    }

    public static double cos(double x, int numTerms){
        x = Math.toRadians(x);
        double res = 0;
        double numerator = 1;
        double denominator = 1;
        for (int num = 1; num <= numTerms; num++){
            res += numerator / denominator;
            numerator *= (-1) * x * x;
            denominator *= (2 * num - 1) * (2 * num);
        }
        return res;
    }

    public static void testTrigonometric(){
        System.out.print("Enter the x value: ");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        double sinFromMethod = sin(x, n);
        double cosFromMethod = cos(x, n);
        double sinFromLib = Math.sin(x);
        double cosFromLib = Math.cos(x);
        double sinError = Math.abs(sinFromLib - sinFromMethod);
        double cosError = Math.abs(cosFromLib - cosFromMethod);
        System.out.println("The error between sin is: " + sinError);
        System.out.println("The error between cos is: " + cosError);
    }

    //5.2
    public static double specialSeries(double x, int numTerms){
        double nume1 = 1;
        double deno1 = 2;
        double nume2 = x * x * x;
        double deno2 = 3;
        double res = x;
        for (int i = 1; i <= numTerms - 1; i++){
            res += (nume1 / deno1) * (nume2 / deno2);
            nume1 = nume1 * (2 * i + 1);
            deno1 = deno1 * (2 * i + 2);
            nume2 = nume2 * x * x;
            deno2 += 2;
        }
        return res;
    }

    public static void testSpecialSeries(){
        try {
            System.out.println("Enter the x value: ");
            double x = sc.nextDouble();
            System.out.println("Enter the number of terms: ");
            int numTerms = sc.nextInt();

            if (x < -1 || x > 1){
                throw new Exception("Invalid x!");
            }
            else {
                System.out.println("The value of the series is: " + specialSeries(x, numTerms));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //5.3
    public static void factorialInt() {
        int number = 1;
        long factorial = 1;
        while (Integer.MAX_VALUE > factorial) {
            System.out.println("Factorial of " + number + " is " + factorial);
            number++;
            factorial *= number;
            if (number == 100){
                break;
            }
        }

        System.out.println("Factorial of " + number + " is out of range");
    }

    //5.4
    public static void fibonacciInt() {
        int F1 = 1;
        int F2 = 1;
        int F3 = 0;
        int count = 2;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (Integer.MAX_VALUE - F1 > F2) {
            F3 = F1 + F2;
            System.out.println("F(" + count + ") = " + F3);
            ++count;
            F1 = F2;
            F2 = F3;
        }
        System.out.println("F(" + count + ") is out of range");
    }
}





