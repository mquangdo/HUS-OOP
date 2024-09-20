package week6;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(8));
    }

    public static int factorial(int n){
        int prod = 1;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i = i + 2) {
                prod *= i;
            }
        }
        else {
            for (int i = 2; i <= n; i = i + 2) {
                prod *= i;
            }
        }
        return prod;
    }
}
