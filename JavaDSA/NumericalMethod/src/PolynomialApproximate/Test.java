package PolynomialApproximate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Double, Double> f = x -> x;
        System.out.println(solve1(f, -2.0, 2.0));
        System.out.println(solve2(f, -2.0, 2.0));
        System.out.println(solve3(f, -2.0, 2.0));
    }

    public static double solve1(Function<Double, Double> f,double a, double b){
        double f_a = f.apply(a);
        double f_b = f.apply(b);
        double c = 0;
        double eps = 1e-20;
        while (Math.abs(a - b) > eps){
            c = (a + b) / 2;
            double f_c = f.apply(c);
            if (f_a * f_c < 0){
                b = c;
                f_b = f_c;
            }else {
                a = c;
                f_a = f_c;
            }
            c = (a + b) / 2;
        }
        return c;
    }
    public static double solve3(Function<Double, Double> f, double a, double b){
        double f_a = f.apply(a);
        double f_b = f.apply(b);
        double c = 0;
        double epsilon = 1e-20;
        while (Math.abs(a - b) >= epsilon){
            c = (a + b) / 2;
            double f_c = f.apply(c);
            if (f_c == 0){
                return c;
            }
            if(Math.abs(f_c) < epsilon){
                return c;
            }
            else if (f_c < 0){
                a = c;
                f_a = f_c;
            }
            else {
                b = c;
                f_b = f_c;
            }
        }
        return -1;
    }

    public static double solve2(Function<Double, Double> f, double a, double b){
        double f_a = f.apply(a);
        double f_b = f.apply(b);
        double c = (a + b) / 2;
        double f_c = f.apply(c);
        double eps = 1e-20;
        while (Math.abs(f_c) > eps){
            if (f_a * f_c < 0){
                b = c;
                f_b = f_c;
            }else {
                a = c;
                f_a = f_c;
            }
            c = (a + b) / 2;
            f_c = f.apply(c);
        }
        return c;
    }
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
