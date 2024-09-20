package week5;
import java.util.Scanner;

public class Maclaurin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        double x = sc.nextDouble();
//        System.out.println(exp(x, n));
//        System.out.println(exp(x, 0.000000000001));
        System.out.println(cos(x, 0.0000000000001));
    }

    public static double exp(double x, int n){
        double sum = 1.0;
        double numerator = x;
        double denominator = 1.0;
        for (int i = 1; i < n; i++){
            denominator *= i;
            sum = sum + numerator / denominator;
            numerator *= x;
        }
        return sum;
    }

    public static double exp(double x, double e){
        double sum = 1;
        double numerator = x;
        double denominator = 1.0;
        int i = 1;
        while (Math.abs(numerator / denominator) >= e){
            denominator *= i;
            sum += numerator / denominator;
            numerator *= x;
            i++;
        }
        return sum;
    }
    public static double cos(double x, double e){
        x = Math.toRadians(x);
        double sum = 1;
        double numerator = x * x * -1;
        double denominator = 1;
        int i = 0;
        while (Math.abs(numerator / denominator) >= e){
            denominator *= (i + 1) * (i + 2);
            sum += numerator / denominator;
            numerator *= -1 * x * x;
            i += 2;
        }
        return sum;
    }
}

